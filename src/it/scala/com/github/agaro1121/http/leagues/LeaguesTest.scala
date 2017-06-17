package com.github.agaro1121.http.leagues

import cats.data.ValidatedNel
import com.github.agaro1121.common.PathOfExileTestSuite
import com.github.agaro1121.exception.{BadLeagueEndpointArgument, BadLeaguesEndpointArgument, HttpError}
import com.github.agaro1121.models.leagues.{League, Leagues}
import scala.concurrent.Future

//TODO add tests for good combinations of query params
class LeaguesTest extends PathOfExileTestSuite {

  "Leagues live response" should {

    "get a 200(Ok) and unmarshal to `League` " in {
      val response: ValidatedNel[BadLeagueEndpointArgument, Future[Either[HttpError, League]]] =
        pathOfExileClient.getLeague("Hardcore")

      response.foreach { resp =>
        whenReady(resp) { result =>
          result.isRight shouldBe true
        }
      }

    }

    "get a 200(Ok) and unmarshal to `Leagues` " in {
      val response: ValidatedNel[BadLeaguesEndpointArgument, Future[Either[HttpError, Leagues]]] =
        pathOfExileClient.getLeagues()

      response.foreach { resp =>
        whenReady(resp) { result =>
          withClue(s"result was: $result") {
            result.isRight shouldBe true
          }
        }
      }

    }

  }
}
