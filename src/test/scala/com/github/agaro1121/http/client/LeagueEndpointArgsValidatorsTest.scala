package com.github.agaro1121.http.client

import cats.data.NonEmptyList
import cats.data.Validated.{Invalid, invalidNel}
import com.github.agaro1121.common.PathOfExileTestSuite
import com.github.agaro1121.exception.{BadLadder, BadLadderLimit, BadLadderTrack}

class LeagueEndpointArgsValidatorsTest extends PathOfExileTestSuite {

  "LeagueEndpointArgsValidators" should {
    val SampleId: String = "Hardcore"

    "validate ladder is either 0 or 1" in {
      val response = pathOfExileClient.getLeague(SampleId, ladder = Some(5))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadLadder(s"The value of ladder can only be zero or 1"))
    }

    "validate Ladder Limit is not greater than 200 when ladder = 1" in {
      val response = pathOfExileClient.getLeague(SampleId, ladder = Some(1), ladderLimit = Some(201))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadLadderLimit(s"The value of ladderLimit must be less than 200 when ladder is 1"))
    }

    "validate Ladder Track is not set if ladder is not equal to 1" in {
      val response = pathOfExileClient.getLeague(SampleId, ladder = Some(0), ladderTrack = Some(5))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadLadderTrack(s"LadderTrack can only be set when ladder is 1"))
    }

    "validate Ladder Offset is not set if ladder is not equal to 1" in {
      val response = pathOfExileClient.getLeague(SampleId, ladder = Some(0), ladderOffset = Some(5))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(BadLadderLimit(s"LadderOffset can only be set when ladder is 1"))
    }

    "validate ladder is either 0 or 1 and " +
      "validate Ladder Track is not set if ladder is not equal to 1 and " +
      "validate Ladder Offset is not set if ladder is not equal to 1" in {
        val response = pathOfExileClient.getLeague(SampleId, ladder = Some(5), ladderOffset = Some(5), ladderTrack = Some(5))
        response.isInvalid shouldBe true
        response shouldBe Invalid(NonEmptyList(
          BadLadder("The value of ladder can only be zero or 1"),
          List(
            BadLadderLimit("LadderOffset can only be set when ladder is 1"),
            BadLadderTrack("LadderTrack can only be set when ladder is 1")
          )
        ))
      }

  }
}
