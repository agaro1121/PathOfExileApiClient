package http.client

import cats.data.ValidatedNel
import cats.data.Validated.{invalidNel, valid}
import exception._

trait LeagueEndpointArgsValidators {

  def validateLadder(ladder: Option[Int]): ValidatedNel[BadLeagueEndpointArgument, Option[Int]] = {
    ladder match {
      case Some(value) if !(value == 0 || value == 1) =>
        invalidNel(BadLadderException(s"The value of ladder can only be zero or 1"))
      case _ => valid(ladder)
    }
  }

  def validateLadderLimit(ladder: Option[Int], ladderLimit: Option[Int]): ValidatedNel[BadLeagueEndpointArgument, Option[Int]] = {
    val MaxLimitWhenLadderIsOne: Int = 200

    (ladder, ladderLimit) match {
      case (Some(1), Some(l)) if l > MaxLimitWhenLadderIsOne =>
        invalidNel(BadLadderLimitException(s"The value of ladderLimit must be less than $MaxLimitWhenLadderIsOne when ladder is 1"))

      case _ => valid(ladderLimit)
    }
  }

  def validateLadderOffset(ladder: Option[Int], ladderOffset: Option[Int]): ValidatedNel[BadLeagueEndpointArgument, Option[Int]] = {
    (ladder, ladderOffset) match {
      case (Some(l), Some(_)) if l != 1 =>
        invalidNel(BadLadderLimitException(s"LadderOffset can only be set when ladder is 1"))

      case _ => valid(ladderOffset)
    }
  }

  def validateLadderTrack(ladder: Option[Int], ladderTrack: Option[Int]): ValidatedNel[BadLeagueEndpointArgument, Option[Int]] = {
    (ladder, ladderTrack) match {
      case (Some(l), Some(_)) if l != 1 =>
        invalidNel(BadLadderTrackLimitException(s"LadderTrack can only be set when ladder is 1"))

      case _ => valid(ladderTrack)
    }
  }

}
