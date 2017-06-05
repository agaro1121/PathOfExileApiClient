package models.leaguerules

case class LeagueRule(
  id: Int,
  name: String,
  description: String
)

case class LeagueRules(leagueRules: List[LeagueRule])
