package com.github.agaro1121.models.stashes

import shapeless._

case class Property(
  name: String,
  values: List[String :: Int :: HNil],
  displayMode: Double,
  `type`: Option[Int],
  progress: Option[Double]
)
