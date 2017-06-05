package http.client

import cats.data.{NonEmptyList, Validated, ValidatedNel}
import cats.data.Validated.{invalidNel, valid}
import exception.{BadLeaguesEndpointArgument, LeagueCompactException, LeagueLimitException, SeasonNotSpecifiedException}
import models.leagues.LeagueType
import models.leagues.LeagueType.SEASON

trait LeaguesEndpointArgsValidators {

  def validateSeason(`type`: Option[LeagueType], season: Option[String]): ValidatedNel[BadLeaguesEndpointArgument, Option[String]] = {
    (`type`, season) match {
      case (Some(SEASON), None) =>
        invalidNel(SeasonNotSpecifiedException("You must specify a season when type=SEASON"))
      case _ => valid(season)
    }
  }

  def validateCompact(compact: Option[Int]): ValidatedNel[BadLeaguesEndpointArgument, Option[Int]] = {
    compact match {
      case Some(value) if !(value == 0 || value == 1) =>
        invalidNel(LeagueCompactException(s"The value of compact can only be zero or 1"))
      case _ => valid(compact)
    }
  }

  def validateLimit(compact: Option[Int], limit: Option[Int]): ValidatedNel[BadLeaguesEndpointArgument, Option[Int]] = {
    val MaxLimitWhenCompactIsZero: Int = 50
    val MaxLimitWhenCompactIsOne: Int = 230

    (compact, limit) match {
      case (Some(1), Some(l)) if l > MaxLimitWhenCompactIsOne =>
        invalidNel(LeagueLimitException(s"The value of limit must be less than $MaxLimitWhenCompactIsOne when compact is 1"))

      case (Some(0), Some(l)) if l > MaxLimitWhenCompactIsZero =>
        invalidNel(LeagueLimitException(s"The value of limit must be less than $MaxLimitWhenCompactIsZero when compact is zero"))

      case (None, Some(_)) =>
        invalidNel(LeagueLimitException(s"Limit cannot be set when compact is not set"))

      case _ => valid(limit)
    }
  }

}
