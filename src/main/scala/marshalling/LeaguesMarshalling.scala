package marshalling

import de.heikoseeberger.akkahttpcirce.CirceSupport
import io.circe.generic.semiauto._
import io.circe._
import models.leagues.{League, Leagues, Rule}
import io.circe.syntax._

trait LeaguesMarshalling extends LadderMarshalling with CirceSupport {

  implicit protected lazy val RuleDecoder: Decoder[Rule] = deriveDecoder[Rule]
  implicit protected lazy val RuleEncoder: Encoder[Rule] = deriveEncoder[Rule]

  implicit protected lazy val LeagueListingDecoder: Decoder[League] = deriveDecoder[League]
  implicit protected lazy val LeagueListingEncoder: Encoder[League] = deriveEncoder[League]

  implicit protected lazy val LeaguesDecoder: Decoder[Leagues] =
    (c: HCursor) => c.as[List[League]].map(Leagues)

  implicit protected lazy val LeaguesEncoder: Encoder[Leagues] =
    (a: Leagues) => a.leagues.asJson

}
