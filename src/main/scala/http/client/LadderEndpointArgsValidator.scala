package http.client

import java.time.ZonedDateTime
import cats.data.Validated.{invalidNel, valid}
import cats.data.ValidatedNel
import exception.{BadDifficulty, BadLadderEndpointArgument, BadLimit, BadStart}
import models.ladder.LadderType
import models.ladder.LadderType.LABYRINTH
import models.leagues.LadderDifficulty

trait LadderEndpointArgsValidator {

  protected def validateLimit(limit: Option[Int]): ValidatedNel[BadLadderEndpointArgument, Option[Int]] = {
    val MaxLimit = 200

    limit match {
      case Some(value) if value > MaxLimit =>
        invalidNel(BadLimit(s"The value of limit can not be greater than $MaxLimit"))
      case _ => valid(limit)
    }
  }

  protected def validateDifficulty(`type`: Option[LadderType], difficulty: Option[LadderDifficulty]):
    ValidatedNel[BadLadderEndpointArgument, Option[LadderDifficulty]] = {
      (`type`, difficulty) match {
        case (Some(someType), Some(_)) if !(someType == LABYRINTH) =>
          invalidNel(BadDifficulty("Difficulty can only be set when type is Labyrinth"))

        case _ => valid(difficulty)
      }
    }

  protected def validateStart(`type`: Option[LadderType], start: Option[ZonedDateTime]):
    ValidatedNel[BadLadderEndpointArgument, Option[ZonedDateTime]] = {
      (`type`, start) match {
        case (Some(someType), Some(_)) if !(someType == LABYRINTH) =>
          invalidNel(BadStart("Difficulty can only be set when type is Labyrinth"))

        case _ => valid(start)
      }
    }

}
