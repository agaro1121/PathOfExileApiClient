package http.client

import cats.data.Validated.{invalidNel, valid}
import cats.data.ValidatedNel
import exception._
import models.ladders.LadderType
import models.ladders.LadderType.LABYRINTH
import models.leagues.LadderDifficulty

trait LaddersEndpointArgsValidator {

  def validateLimit(limit: Option[Int]): ValidatedNel[BadLaddersEndpointArgument, Option[Int]] = {
    val MaxLimit = 200

    limit match {
      case Some(value) if value > MaxLimit =>
        invalidNel(BadLimitException(s"The value of limit can not be greater than $MaxLimit"))
      case _ => valid(limit)
    }
  }

  def validateDifficulty(`type`: Option[LadderType], difficulty: Option[LadderDifficulty]):
    ValidatedNel[BadDifficultyException, Option[LadderDifficulty]] = {
      (`type`, difficulty) match {
        case (Some(someType), Some(_)) if !(someType == LABYRINTH) =>
          invalidNel(BadDifficultyException("Difficulty can only be set when type is Labyrinth"))

        case _ => valid(difficulty)
      }
    }

  def validateStart(`type`: Option[LadderType], start: Option[String]):
    ValidatedNel[BadStartException, Option[String]] = {
      (`type`, start) match {
        case (Some(someType), Some(_)) if !(someType == LABYRINTH) =>
          invalidNel(BadStartException("Difficulty can only be set when type is Labyrinth"))

        case _ => valid(start)
      }
    }

}
