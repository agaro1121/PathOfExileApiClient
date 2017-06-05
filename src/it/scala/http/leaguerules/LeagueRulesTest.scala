package http.leaguerules

import cats.data.ValidatedNel
import common.PathOfExileTestSuite
import exception.{BadLeagueEndpointArgument, HttpError}
import models.leaguerules.{LeagueRule, LeagueRules}
import models.leagues.League

import scala.concurrent.Future

class LeagueRulesTest
  extends PathOfExileTestSuite {

  "League Rules Endpoint" should {
    "get a 200(Ok) and unmarshal to `LeagueRule` " in {
      val response: Future[Either[HttpError, LeagueRule]] =
        pathOfExileClient.getLeagueRule(4)

      whenReady(response) { result =>
        withClue(s"result was: $result") {
          result.isRight shouldBe true
        }
      }

    }

    "get a 200(Ok) and unmarshal to `LeagueRules` " in {
      val response: Future[Either[HttpError, LeagueRules]] =
        pathOfExileClient.getLeagueRules

      whenReady(response) { result =>
        withClue(s"result was: $result") {
          result.isRight shouldBe true
        }
      }

    }

  }

}
