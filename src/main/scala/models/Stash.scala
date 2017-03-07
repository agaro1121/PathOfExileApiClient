package models

import akka.shapeless.{HList, HNil}
import io.circe._, io.circe.generic.semiauto._
import io.circe.Decoder, io.circe.generic.auto._
import io.circe.Decoder
import io.circe.generic.auto._

case class Stash(
  accountName: String,
  lastCharacterName: String,
  id: String,
  stash: String,
  stashType: String,
  items: List[Item],
  public: Boolean
)

object Stash {
  implicit lazy val decoder: Decoder[Stash] = deriveDecoder[Stash]
  implicit lazy val encoder: Encoder[Stash] = deriveEncoder[Stash]
}

