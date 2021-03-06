package com.github.agaro1121.config

import classy.generic._
import classy.config._
import com.typesafe.config.{Config, ConfigFactory}
import com.github.agaro1121.exception.MissingConfiguration

case class PathOfExileHttpConfig(
  `api-url`: String,
  `public-stash-tabs`: String,
  leagues: String,
  `league-rules`: String,
  ladders: String,
  `pvp-matches`: String,
  retries: Int
)

object PathOfExileHttpConfig {

  lazy val default: PathOfExileHttpConfig = {
    val decoder = deriveDecoder[Config, PathOfExileHttpConfig]
    val typeSafeConfig = ConfigFactory.defaultReference().getConfig("path-of-exile")
    decoder(typeSafeConfig) match {
      case Left(error) =>
        System.err.println("com.github.agaro1121.config error: " + error)
        throw MissingConfiguration(error.toString)
      case Right(pathOfExileHttpConfig) => pathOfExileHttpConfig
    }
  }

}
