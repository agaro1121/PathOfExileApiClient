package models

import io.circe._
import io.circe.generic.semiauto._
import io.circe.Decoder
import io.circe.generic.auto._
import io.circe.Decoder
import io.circe.generic.auto._
import shapeless.{::, HList, HNil}
import io.circe.shapes._
import io.circe.parser._


case class Property[L <: HList](
                     name: String,
                     values: List[L],
                     displayMode: Double,
                     `type`: Option[Int],
                     progress: Option[Double]
                   )
object Property {
  // implicit lazy val propertyDecoder = deriveDecoder[Property[String :: Int :: HNil]]
  // implicit lazy val propertyEncoder = deriveEncoder[Property[String :: Int :: HNil]]
}
