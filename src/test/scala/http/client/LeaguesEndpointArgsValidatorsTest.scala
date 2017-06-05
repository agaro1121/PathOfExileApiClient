package http.client

import cats.data.NonEmptyList
import common.PathOfExileTestSuite
import models.leagues.LeagueType
import cats.data.Validated._
import exception.{LeagueCompactException, LeagueLimitException, SeasonNotSpecifiedException}

class LeaguesEndpointArgsValidatorsTest extends PathOfExileTestSuite {

  "Leagues arguments validator" should {

    "validate season is set when type=season" in {
      val response = pathOfExileClient.getLeagues(`type` = Some(LeagueType.SEASON), season = None)
      response.isInvalid shouldBe true
      response shouldBe invalidNel(SeasonNotSpecifiedException("You must specify a season when type=SEASON"))
    }

    "validate compact is either 0 or 1" in {
      val response = pathOfExileClient.getLeagues(compact = Some(5))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(LeagueCompactException(s"The value of compact can only be zero or 1"))
    }

    "validate limit is below 50 correct when compact = 0" in {
      val response = pathOfExileClient.getLeagues(compact = Some(0), limit = Some(51))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(LeagueLimitException(s"The value of limit must be less than 50 when compact is zero"))
    }

    "validate limit is below 230 correct when compact = 1" in {
      val response = pathOfExileClient.getLeagues(compact = Some(1), limit = Some(235))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(LeagueLimitException(s"The value of limit must be less than 230 when compact is 1"))
    }

    "validate limit is not set when compact is not set either" in {
      val response = pathOfExileClient.getLeagues(limit = Some(100))
      response.isInvalid shouldBe true
      response shouldBe invalidNel(LeagueLimitException(s"Limit cannot be set when compact is not set"))
    }

    "validate season is set when type=season AND validate limit is not set when compact is not set either" in {
      val response = pathOfExileClient.getLeagues(`type` = Some(LeagueType.SEASON), season = None, limit = Some(100))
      response.isInvalid shouldBe true
      response shouldBe Invalid(NonEmptyList(
        SeasonNotSpecifiedException("You must specify a season when type=SEASON"),
        List(LeagueLimitException("Limit cannot be set when compact is not set"))))
    }

  }

}
