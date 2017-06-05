package parsing

import common.PathOfExileTestSuite
import io.circe.parser._
import marshalling.LadderMarshalling
import models.ladders.Ladder

class LadderTest
  extends PathOfExileTestSuite
  with LadderMarshalling {

  "Ladder" should {

    "unmarshal successfully" in {
      val json = parse(payloads.Ladders.payload)
      val ladderParseResult = json.map(_.as[Ladder])
      ladderParseResult.isRight shouldBe true
      ladderParseResult.foreach{ decoderResult =>
        decoderResult.isRight shouldBe true
        decoderResult.foreach{ ladder =>
          ladder.total shouldBe 15000
          ladder.entries.head.account.name shouldBe "Jin_melike"
        }
      }
    }
  }

}
