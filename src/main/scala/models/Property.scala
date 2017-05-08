package models

import shapeless._

case class Property(
  name: String,
  values: List[String :: Int :: HNil],
  displayMode: Double,
  `type`: Option[Int],
  progress: Option[Double]
)
