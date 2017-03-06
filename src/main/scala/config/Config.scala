package config

import com.typesafe.config.ConfigFactory

case class Config(url: String)

object Config {
  def fromReference: Config = {
    Config(ConfigFactory.defaultReference().getString("path-of-exile.url"))
  }
}
