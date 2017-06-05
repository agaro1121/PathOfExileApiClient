package models.stashes

case class Stash(
  accountName: Option[String],
  lastCharacterName: String,
  id: String,
  stash: String,
  stashType: String,
  items: List[Item],
  public: Boolean
)
