package com.github.agaro1121.http.pvpmatches

import com.github.agaro1121.common.PathOfExileTestSuite
import com.github.agaro1121.exception.HttpError
import com.github.agaro1121.models.pvpmatches.PvpMatches
import scala.concurrent.Future

class PvpMatchesTest
  extends PathOfExileTestSuite {

  "PvpMatches live response" should {

    "get a 200(Ok) and unmarshal to `PvpMatches` " in {
      val response: Future[Either[HttpError, PvpMatches]] =
        pathOfExileClient.getPvpMatches()

        whenReady(response) { result =>
          result.isRight shouldBe true
        }

    }

    "get a 200(Ok) and unmarshal to `pvpMatches` " in {
      val response: Future[Either[HttpError, PvpMatches]] =
        pathOfExileClient.getPvpMatches(Some("EUPvPSeason1"))

        whenReady(response) { result =>
          withClue(s"result was: $result") {
            result.isRight shouldBe true
          }
        }

    }

  }


}
