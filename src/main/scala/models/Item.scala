package models

import io.circe._
import io.circe.generic.semiauto._
import io.circe.Decoder
import io.circe.generic.auto._
import io.circe.Decoder
import io.circe.generic.auto._
import shapeless.{::, HList, HNil}
import io.circe.shapes._

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
                 properties: Option[List[Property[String :: Int :: HNil]]],
                 additionalProperties: Option[List[Property[String :: Int :: HNil]]],
                 requirements: Option[List[Requirement[String :: Int :: HNil]]],
                 utilityMods: Option[List[String]],
                 nextLevelRequirements: Option[List[Requirement[String :: Int :: HNil]]],
                 implicitMods: Option[List[String]],
                 secDescrText: Option[String],
                 explicitMods: Option[List[String]],
                 descrText: Option[String],
                 flavourText: Option[List[String]],
                 frameType: Double,
                 x: Double,
                 y: Double,
                 inventoryId: String,
                 socketedItems: List[Item]
               )

object Item {
  implicit lazy val decoder: Decoder[Item] = deriveDecoder[Item]
  implicit lazy val encoder: Encoder[Item] = deriveEncoder[Item]
}

