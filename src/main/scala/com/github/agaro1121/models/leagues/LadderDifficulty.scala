package com.github.agaro1121.models.leagues

import scala.util.Try

sealed trait LadderDifficulty

object LadderDifficulty {

  case object STANDARD extends LadderDifficulty {
    override def toString: String = "1"
  }

  case object CRUEL extends LadderDifficulty {
    override def toString: String = "2"
  }

  case object MERCILESS extends LadderDifficulty {
    override def toString: String = "3"
  }

  def fromString(string: String): Option[LadderDifficulty] = {
    Try(string.toInt).toOption.flatMap(fromInt)
  }

  def fromInt(int: Int): Option[LadderDifficulty] = {
    int match {
      case 1 => Some(STANDARD)
      case 2 => Some(CRUEL)
      case 3 => Some(MERCILESS)
      case _ => None
    }
  }

}
