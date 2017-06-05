package parsing

import common.PathOfExileTestSuite
import io.circe.parser._
import marshalling.PvpMatchesMarshalling
import models.pvpmatches.PvpMatches

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
