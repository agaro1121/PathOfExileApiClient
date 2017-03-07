package models

import akka.shapeless.{HList, HNil}
import io.circe._, io.circe.generic.semiauto._
import io.circe.Decoder, io.circe.generic.auto._
import io.circe.Decoder
import io.circe.generic.auto._

case class Socket(
                   group: Double,
                   attr: String
                 )

object Socket {
  implicit lazy val decoder: Decoder[Socket] = deriveDecoder[Socket]
  implicit lazy val encoder: Encoder[Socket] = deriveEncoder[Socket]
}

