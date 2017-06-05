package http.leaguerules

import cats.data.ValidatedNel
import common.PathOfExileTestSuite
import exception.{BadLeagueEndpointArgument, HttpException}
import models.leaguerules.{LeagueRule, LeagueRules}
import models.leagues.League

import scala.concurrent.Future

class LeagueRulesTest
  extends PathOfExileTestSuite {

  "League Rules Endpoint" should {
    "get a 200(Ok) and unmarshal to `LeagueRule` " in {
      val response: Future[Either[HttpException, LeagueRule]] =
        pathOfExileClient.getLeagueRule(4)

      whenReady(response) { result =>
        result.isRight shouldBe true
      }

    }

    "get a 200(Ok) and unmarshal to `LeagueRules` " in {
      val response: Future[Either[HttpException, LeagueRules]] =
        pathOfExileClient.getLeagueRules

      whenReady(response) { result =>
        result.isRight shouldBe true
      }

    }

  }

}
