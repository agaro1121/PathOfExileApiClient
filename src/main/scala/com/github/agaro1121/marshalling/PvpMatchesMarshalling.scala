package com.github.agaro1121.marshalling

import io.circe.{Decoder, Encoder, HCursor}
import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}
import io.circe.syntax._
import com.github.agaro1121.models.pvpmatches.{PvpMatch, PvpMatches}

trait PvpMatchesMarshalling {

  implicit protected lazy val PvpMatchDecoder: Decoder[PvpMatch] = deriveDecoder[PvpMatch]
  implicit protected lazy val PvpMatchEncoder: Encoder[PvpMatch] = deriveEncoder[PvpMatch]

  implicit protected lazy val PvpMatchesDecoder: Decoder[PvpMatches] =
    (c: HCursor) => c.as[List[PvpMatch]].map(PvpMatches)

  implicit protected lazy val PvpMatchesEncoder: Encoder[PvpMatches] =
    (a: PvpMatches) => a.pvpMatches.asJson

}
