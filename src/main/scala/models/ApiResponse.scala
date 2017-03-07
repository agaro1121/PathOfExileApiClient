package models

import akka.shapeless.{HList, HNil}
import io.circe._, io.circe.generic.semiauto._
import io.circe.Decoder, io.circe.generic.auto._
import io.circe.Decoder
import io.circe.generic.auto._

case class ApiResponse(
  next_change_id: String,
  stashes: List[Stash]
)

object ApiResponse {
  implicit lazy val decoder: Decoder[ApiResponse] = deriveDecoder[ApiResponse]
  implicit lazy val encoder: Encoder[ApiResponse] = deriveEncoder[ApiResponse]
}