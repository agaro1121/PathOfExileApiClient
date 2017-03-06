package models

import akka.shapeless.{HList, HNil}

case class Socket(
  group: Double,
  attr: String
)

case class Requirement(
                        name: String,
                        //                        values: List[AnyVal],
                        values: HList, // String :: Int
                        displayMode: Double
)

case class Property(
  name: String,
  //  values: List[AnyVal],
  values: HList,
  displayMode: Double,
  `type`: Option[String]
)

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
  note: String,
  properties: List[Property],
  requirements: List[Requirement],
  explicitMods: List[String],
  flavourText: List[String],
  frameType: Double,
  x: Double,
  y: Double,
  inventoryId: String,
  socketedItems: List[Item]
)

case class Stash(
  accountName: String,
  lastCharacterName: String,
  id: String,
  stash: String,
  stashType: String,
  items: List[Item],
  public: Boolean
)

case class ApiResponse(
  next_change_id: String,
  stashes: List[Stash]
)
