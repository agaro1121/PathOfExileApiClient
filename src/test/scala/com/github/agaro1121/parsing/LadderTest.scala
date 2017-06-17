package com.github.agaro1121.parsing

import com.github.agaro1121.common.PathOfExileTestSuite
import io.circe.parser._
import com.github.agaro1121.marshalling.LadderMarshalling
import com.github.agaro1121.models.ladder.Ladder

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
