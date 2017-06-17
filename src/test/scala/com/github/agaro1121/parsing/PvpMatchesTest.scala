package com.github.agaro1121.parsing

import com.github.agaro1121.common.PathOfExileTestSuite
import io.circe.parser._
import com.github.agaro1121.marshalling.PvpMatchesMarshalling
import com.github.agaro1121.models.pvpmatches.PvpMatches

class PvpMatchesTest
  extends PathOfExileTestSuite
  with PvpMatchesMarshalling {

  "PvP Matches" should {
    "unmarshal" in {
      val json = parse(payloads.PvpMatches.payload)
      val pvpMatchesParseResult = json.map(_.as[PvpMatches])
      pvpMatchesParseResult.isRight shouldBe true
      pvpMatchesParseResult.foreach{ decoderResult =>
        decoderResult.isRight shouldBe true
        decoderResult.foreach{ pvpMatches =>
          pvpMatches.pvpMatches.head.description shouldBe "Best of Seven Low Level Dueling"
        }
      }
    }
  }

}
