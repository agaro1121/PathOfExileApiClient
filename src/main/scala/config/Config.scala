package config

import com.typesafe.config.ConfigFactory

case class Config(url: String, clientRetries: Int)

object Config {
  lazy val fromReference: Config = {
    val reference = ConfigFactory.defaultReference()
    Config(reference.getString("path-of-exile.url"), reference.getInt("path-of-exile.retries"))
  }
}
