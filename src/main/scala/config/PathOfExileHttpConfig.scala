package config

import com.typesafe.config.ConfigFactory

//TODO: Replace with a config library like case-classy or ciris(https://cir.is)

case class PathOfExileHttpConfig(
  apiUrl: String,
  `public-stash-tabs`: String,
  leagues: String,
  `league-rules`: String,
  ladders: String,
  `pvp-matches`: String,
  retries: Int
)

object PathOfExileHttpConfig {

  lazy val fromReference: PathOfExileHttpConfig = {
    val reference = ConfigFactory.defaultReference()
    val pathOfExileConfig = reference.getConfig("path-of-exile")

    PathOfExileHttpConfig(
      apiUrl = pathOfExileConfig.getString("url"),
      `public-stash-tabs` = pathOfExileConfig.getString("public-stash-tabs"),
      leagues = pathOfExileConfig.getString("leagues"),
      `league-rules` = pathOfExileConfig.getString("league-rules"),
      ladders = pathOfExileConfig.getString("ladders"),
      `pvp-matches` = pathOfExileConfig.getString("pvp-matches"),
      retries = pathOfExileConfig.getInt("retries")
    )
  }

}
