package models.leagues

import java.time.Instant
import models.ladders.Ladder

case class Rule(
  id: Int,
  name: String,
  description: String
)

case class League(
  id: String,
  url: Option[String],
  startAt: Option[Instant],
  endAt: Option[String],
  description: Option[String],
  registerAt: Option[String],
  rules: Option[List[Rule]],
  event: Option[Boolean],
  ladder: Option[Ladder]
)

case class Leagues(leagues: List[League])