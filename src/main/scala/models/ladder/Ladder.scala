package models.ladder

case class Character(
  name: String,
  level: Double,
  `class`: String,
  experience: Double
)

case class Challenges(
  total: Double
)

case class Twitch(
  name: String
)

case class Account(
  name: String,
  challenges: Challenges,
  twitch: Option[Twitch]
)

case class Entries(
  rank: Double,
  dead: Boolean,
  online: Boolean,
  character: Character,
  account: Account
)

case class Ladder(
  total: Double,
  entries: List[Entries]
)