package marshalling

import de.heikoseeberger.akkahttpcirce.CirceSupport
import io.circe.{Decoder, Encoder, HCursor}
import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}
import io.circe.syntax._
import models.leaguerules.{LeagueRule, LeagueRules}

trait LeagueRulesMarshalling extends CirceSupport {

  implicit protected lazy val LeagueRuleDecoder: Decoder[LeagueRule] = deriveDecoder[LeagueRule]
  implicit protected lazy val LeagueRuleEncoder: Encoder[LeagueRule] = deriveEncoder[LeagueRule]

  implicit protected lazy val LeagueRulesDecoder: Decoder[LeagueRules] =
    (c: HCursor) => c.as[List[LeagueRule]].map(LeagueRules)

  implicit protected lazy val LeagueRulesEncoder: Encoder[LeagueRules] =
    (a: LeagueRules) => a.leagueRules.asJson

}
