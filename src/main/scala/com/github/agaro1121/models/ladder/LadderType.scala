package com.github.agaro1121.models.ladder

sealed trait LadderType {
  override def toString: String = getClass.getSimpleName.toLowerCase.replace("$","")
}

object LadderType {

  case object LEAGUE extends LadderType
  case object PVP extends LadderType
  case object LABYRINTH extends LadderType

  def fromString(string: String): Option[LadderType] = {
    string.toUpperCase match {
      case "LEAGUE" => Some(LEAGUE)
      case "PVP" => Some(PVP)
      case "LABYRINTH" => Some(LABYRINTH)
      case _ => None
    }
  }

}