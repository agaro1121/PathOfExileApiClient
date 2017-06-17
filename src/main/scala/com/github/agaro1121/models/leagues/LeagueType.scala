package com.github.agaro1121.models.leagues

sealed trait LeagueType {
  override def toString: String = getClass.getSimpleName.toLowerCase.replace("$","")
}

object LeagueType {

  case object ALL extends LeagueType
  case object MAIN extends LeagueType
  case object EVENT extends LeagueType
  case object SEASON extends LeagueType

  def fromString(string: String): Option[LeagueType] = {
    string.toUpperCase match {
      case "ALL" => Some(ALL)
      case "MAIN" => Some(MAIN)
      case "EVENT" => Some(EVENT)
      case "SEASON" => Some(SEASON)
      case _ => None
    }
  }

}