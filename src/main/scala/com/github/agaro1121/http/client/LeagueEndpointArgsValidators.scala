package com.github.agaro1121.http.client

import cats.data.ValidatedNel
import cats.data.Validated.{invalidNel, valid}
import com.github.agaro1121.exception._

trait LeagueEndpointArgsValidators {

  protected def validateLadder(ladder: Option[Int]): ValidatedNel[BadLeagueEndpointArgument, Option[Int]] = {
    ladder match {
      case Some(value) if !(value == 0 || value == 1) =>
        invalidNel(BadLadder(s"The value of ladder can only be zero or 1"))
      case _ => valid(ladder)
    }
  }

  protected def validateLadderLimit(ladder: Option[Int], ladderLimit: Option[Int]): ValidatedNel[BadLeagueEndpointArgument, Option[Int]] = {
    val MaxLimitWhenLadderIsOne: Int = 200

    (ladder, ladderLimit) match {
      case (Some(1), Some(l)) if l > MaxLimitWhenLadderIsOne =>
        invalidNel(BadLadderLimit(s"The value of ladderLimit must be less than $MaxLimitWhenLadderIsOne when ladder is 1"))

      case _ => valid(ladderLimit)
    }
  }

  protected def validateLadderOffset(ladder: Option[Int], ladderOffset: Option[Int]): ValidatedNel[BadLeagueEndpointArgument, Option[Int]] = {
    (ladder, ladderOffset) match {
      case (Some(l), Some(_)) if l != 1 =>
        invalidNel(BadLadderLimit(s"LadderOffset can only be set when ladder is 1"))

      case _ => valid(ladderOffset)
    }
  }

  protected def validateLadderTrack(ladder: Option[Int], ladderTrack: Option[Int]): ValidatedNel[BadLeagueEndpointArgument, Option[Int]] = {
    (ladder, ladderTrack) match {
      case (Some(l), Some(_)) if l != 1 =>
        invalidNel(BadLadderTrack(s"LadderTrack can only be set when ladder is 1"))

      case _ => valid(ladderTrack)
    }
  }

}
