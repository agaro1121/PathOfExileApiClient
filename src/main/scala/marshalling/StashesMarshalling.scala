package marshalling

import io.circe.generic.semiauto._
import io.circe.{Decoder, Encoder}
import models.stashes._
import io.circe.shapes._


trait StashesMarshalling {

  implicit protected lazy val PropertyDecoder: Decoder[Property] = deriveDecoder[Property]
  implicit protected lazy val PropertyEncoder: Encoder[Property] = deriveEncoder[Property]

  implicit protected lazy val ItemDecoder: Decoder[Item] = deriveDecoder[Item]
  implicit protected lazy val ItemEncoder: Encoder[Item] = deriveEncoder[Item]

  implicit protected lazy val RequirementDecoder: Decoder[Requirement] = deriveDecoder[Requirement]
  implicit protected lazy val RequirementEncoder: Encoder[Requirement] = deriveEncoder[Requirement]

  implicit protected lazy val SocketDecoder: Decoder[Socket] = deriveDecoder[Socket]
  implicit protected lazy val SocketEncoder: Encoder[Socket] = deriveEncoder[Socket]

  implicit protected lazy val StashDecoder: Decoder[Stash] = deriveDecoder[Stash]
  implicit protected lazy val StashEncoder: Encoder[Stash] = deriveEncoder[Stash]

  implicit protected lazy val StashesDecoder: Decoder[Stashes] = deriveDecoder[Stashes]
  implicit protected lazy val StashesEncoder: Encoder[Stashes] = deriveEncoder[Stashes]

}
