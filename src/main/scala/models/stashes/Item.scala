package models.stashes

case class Item(
  verified: Boolean,
  w: Double,
  h: Double,
  ilvl: Double,
  icon: String,
  league: String,
  id: String,
  sockets: List[Socket],
  name: String,
  typeLine: String,
  identified: Boolean,
  corrupted: Boolean,
  lockedToCharacter: Boolean,
  note: Option[String],
  properties: Option[List[Property]],
  additionalProperties: Option[List[Property]],
  requirements: Option[List[Requirement]],
  utilityMods: Option[List[String]],
  nextLevelRequirements: Option[List[Requirement]],
  implicitMods: Option[List[String]],
  secDescrText: Option[String],
  explicitMods: Option[List[String]],
  descrText: Option[String],
  flavourText: Option[List[String]],
  frameType: Double,
  x: Option[Double], //not in socketed items
  y: Option[Double], //not in socketed items
  inventoryId: Option[String], //not in socketed items
  socketedItems: List[Item]
)
