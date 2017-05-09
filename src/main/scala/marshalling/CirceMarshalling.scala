package marshalling

import de.heikoseeberger.akkahttpcirce.CirceSupport
import io.circe.generic.semiauto._
import io.circe.shapes.LabelledHListInstances
import io.circe.{Decoder, ObjectEncoder}
import models._


trait CirceMarshalling extends LabelledHListInstances with CirceSupport {

  implicit lazy val PropertyDecoder: Decoder[Property] = deriveDecoder[Property]
  implicit lazy val PropertyEncoder: ObjectEncoder[Property] = deriveEncoder[Property]

  implicit lazy val ItemDecoder: Decoder[Item] = deriveDecoder[Item]
  implicit lazy val ItemEncoder: ObjectEncoder[Item] = deriveEncoder[Item]

  implicit lazy val RequirementDecoder: Decoder[Requirement] = deriveDecoder[Requirement]
  implicit lazy val RequirementEncoder: ObjectEncoder[Requirement] = deriveEncoder[Requirement]

  implicit lazy val SocketDecoder: Decoder[Socket] = deriveDecoder[Socket]
  implicit lazy val SocketEncoder: ObjectEncoder[Socket] = deriveEncoder[Socket]

  implicit lazy val StashDecoder: Decoder[Stash] = deriveDecoder[Stash]
  implicit lazy val StashEncoder: ObjectEncoder[Stash] = deriveEncoder[Stash]

  implicit lazy val ApiResponseDecoder: Decoder[ApiResponse] = deriveDecoder[ApiResponse]
  implicit lazy val ApiResponseEncoder: ObjectEncoder[ApiResponse] = deriveEncoder[ApiResponse]

}

object CirceMarshalling extends CirceMarshalling