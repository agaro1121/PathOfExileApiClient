package http.client

import java.time.ZonedDateTime
import cats.data.Validated.invalidNel
import common.PathOfExileTestSuite
import exception.{BadDifficulty, BadLimit, BadStart}
import models.ladder.LadderType.PVP
import models.leagues.LadderDifficulty.CRUEL

class LaddersEndpointArgsValidatorTest extends PathOfExileTestSuite {

  "LaddersEndpointArgsValidatorTest" should {
    val SampleId = "Standard"

    "validate Limit is less than 200" in {
      val response = pathOfExileClient.getLadder(SampleId, limit = Some(201))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadLimit(s"The value of limit can not be greater than 200"))
    }

    "validate difficulty is not set when type is LABYRINTH" in {
      val response = pathOfExileClient.getLadder(SampleId, `type` = Some(PVP), difficulty = Some(CRUEL))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadDifficulty("Difficulty can only be set when type is Labyrinth"))
    }

    "validate start is not set when type is LABYRINTH" in {
      val response = pathOfExileClient.getLadder(SampleId, `type` = Some(PVP), start = Some(ZonedDateTime.now))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadStart("Difficulty can only be set when type is Labyrinth"))
    }

  }
}
