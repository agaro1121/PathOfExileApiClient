package models.leagues

import java.time.ZonedDateTime

import models.ladder.Ladder

case class Rule(
  id: Int,
  name: String,
  description: String
)

case class League(
  id: String,
  url: Option[String],
  startAt: Option[ZonedDateTime],
  endAt: Option[String],
  description: Option[String],
  registerAt: Option[String],
  rules: Option[List[Rule]],
  event: Option[Boolean],
  ladder: Option[Ladder]
)

case class Leagues(leagues: List[League])