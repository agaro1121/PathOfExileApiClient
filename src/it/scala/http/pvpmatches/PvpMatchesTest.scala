package http.pvpmatches

import common.PathOfExileTestSuite
import exception.HttpException
import models.pvpmatches.PvpMatches
import scala.concurrent.Future

class PvpMatchesTest
  extends PathOfExileTestSuite {

  "PvpMatches live response" should {

    "get a 200(Ok) and unmarshal to `PvpMatches` " in {
      val response: Future[Either[HttpException, PvpMatches]] =
        pathOfExileClient.getPvpMatches()

        whenReady(response) { result =>
          result.isRight shouldBe true
        }

    }

    "get a 200(Ok) and unmarshal to `pvpMatches` " in {
      val response: Future[Either[HttpException, PvpMatches]] =
        pathOfExileClient.getPvpMatches(Some("EUPvPSeason1"))

        whenReady(response) { result =>
          result.isRight shouldBe true
        }

    }

  }


}
