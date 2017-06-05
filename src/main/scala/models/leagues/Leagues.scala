package models.leagues

import models.ladders.Ladder

case class Rule(
  id: Int,
  name: String,
  description: String
)

case class League(
  id: String,
  url: Option[String],
  startAt: Option[String], //TODO: "2016-07-22T18:30:00Z" -> Change to proper date? JodaTime? Java Time?
  endAt: Option[String],
  description: String,
  registerAt: Option[String],
  rules: List[Rule],
  event: Boolean,
  ladder: Option[Ladder]
)

case class Leagues(leagues: List[League])