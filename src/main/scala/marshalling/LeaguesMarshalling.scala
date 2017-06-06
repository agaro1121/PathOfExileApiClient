package marshalling

import java.time.format.DateTimeFormatter
import java.time.{Instant, ZonedDateTime}

import de.heikoseeberger.akkahttpcirce.CirceSupport
import io.circe.generic.semiauto._
import io.circe._
import models.leagues.{League, Leagues, Rule}
import io.circe.syntax._
import cats.syntax.either._

trait LeaguesMarshalling extends LadderMarshalling with CirceSupport {

  implicit val ZonedDateTimeEncoder: Encoder[ZonedDateTime] = Encoder.encodeString.contramap[ZonedDateTime](zdt => DateTimeFormatter.ISO_INSTANT.format(zdt))
  implicit protected lazy val ZonedDateTimeDecoder: Decoder[ZonedDateTime] = Decoder.decodeString.emap { str =>
    Either.catchNonFatal(ZonedDateTime.parse(str)).leftMap(_ => "Instant")
  }

  implicit protected lazy val RuleDecoder: Decoder[Rule] = deriveDecoder[Rule]
  implicit protected lazy val RuleEncoder: Encoder[Rule] = deriveEncoder[Rule]

  implicit protected lazy val LeagueListingDecoder: Decoder[League] = deriveDecoder[League]
  implicit protected lazy val LeagueListingEncoder: Encoder[League] = deriveEncoder[League]

  implicit protected lazy val LeaguesDecoder: Decoder[Leagues] =
    (c: HCursor) => c.as[List[League]].map(Leagues)

  implicit protected lazy val LeaguesEncoder: Encoder[Leagues] =
    (a: Leagues) => a.leagues.asJson

}
