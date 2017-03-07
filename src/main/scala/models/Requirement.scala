package models

import io.circe._
import io.circe.generic.semiauto._
import io.circe.Decoder
import io.circe.generic.auto._
import io.circe.Decoder
import io.circe.generic.auto._
import shapeless.{::, HList, HNil}
import io.circe.shapes._


case class Requirement[L <: HList](
                        name: String,
                        values: List[L],
                        displayMode: Double
                      )
object Requirement {
 // implicit lazy val decoder = deriveDecoder[Requirement[String :: Int :: HNil]]
 // implicit lazy val encoder = deriveEncoder[Requirement[String :: Int :: HNil]]
}

