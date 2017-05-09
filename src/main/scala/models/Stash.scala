package models

case class Stash(
  accountName: Option[String], //TODO: optional?
  lastCharacterName: String,
  id: String,
  stash: String,
  stashType: String,
  items: List[Item],
  public: Boolean
)
