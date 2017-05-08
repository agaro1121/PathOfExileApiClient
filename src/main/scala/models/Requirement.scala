package models

import shapeless._

case class Requirement(
  name: String,
  values: List[String :: Int :: HNil],
  displayMode: Double
)
