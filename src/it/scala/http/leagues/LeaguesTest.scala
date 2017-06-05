package http.leagues

import cats.data.ValidatedNel
import common.PathOfExileTestSuite
import exception.{BadLeagueEndpointArgument, BadLeaguesEndpointArgument, HttpException}
import models.leagues.{League, Leagues}
import scala.concurrent.Future

//TODO add tests for good combinations of query params
class LeaguesTest extends PathOfExileTestSuite {

  "Leagues live response" should {

    "get a 200(Ok) and unmarshal to `League` " in {
      val response: ValidatedNel[BadLeagueEndpointArgument, Future[Either[HttpException, League]]] =
        pathOfExileClient.getLeague("Hardcore")

      response.foreach { resp =>
        whenReady(resp) { result =>
          result.isRight shouldBe true
        }
      }

    }

    "get a 200(Ok) and unmarshal to `Leagues` " in {
      val response: ValidatedNel[BadLeaguesEndpointArgument, Future[Either[HttpException, Leagues]]] =
        pathOfExileClient.getLeagues()

      response.foreach { resp =>
        whenReady(resp) { result =>
          result.isRight shouldBe true
        }
      }

    }

  }
}
