package http.client

import cats.data.NonEmptyList
import cats.data.Validated.{Invalid, invalidNel}
import common.PathOfExileTestSuite
import exception.{BadLadderException, BadLadderLimitException, BadLadderTrackLimitException}

class LeagueEndpointArgsValidatorsTest extends PathOfExileTestSuite {

  "LeagueEndpointArgsValidators" should {
    val SampleId: String = "Hardcore"

    "validate ladder is either 0 or 1" in {
      val response = pathOfExileClient.getLeague(SampleId, ladder = Some(5))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadLadderException(s"The value of ladder can only be zero or 1"))
    }

    "validate Ladder Limit is not greater than 200 when ladder = 1" in {
      val response = pathOfExileClient.getLeague(SampleId, ladder = Some(1), ladderLimit = Some(201))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadLadderLimitException(s"The value of ladderLimit must be less than 200 when ladder is 1"))
    }

    "validate Ladder Track is not set if ladder is not equal to 1" in {
      val response = pathOfExileClient.getLeague(SampleId, ladder = Some(0), ladderTrack = Some(5))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadLadderTrackLimitException(s"LadderTrack can only be set when ladder is 1"))
    }

    "validate Ladder Offset is not set if ladder is not equal to 1" in {
      val response = pathOfExileClient.getLeague(SampleId, ladder = Some(0), ladderOffset = Some(5))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadLadderLimitException(s"LadderOffset can only be set when ladder is 1"))
    }

    "validate ladder is either 0 or 1 and " +
      "validate Ladder Track is not set if ladder is not equal to 1 and " +
      "validate Ladder Offset is not set if ladder is not equal to 1" in {
        val response = pathOfExileClient.getLeague(SampleId, ladder = Some(5), ladderOffset = Some(5), ladderTrack = Some(5))
        response.isInvalid shouldBe true
        response shouldBe Invalid(NonEmptyList(
          BadLadderException("The value of ladder can only be zero or 1"),
          List(
            BadLadderLimitException("LadderOffset can only be set when ladder is 1"),
            BadLadderTrackLimitException("LadderTrack can only be set when ladder is 1")
          )
        ))
      }

  }
}
