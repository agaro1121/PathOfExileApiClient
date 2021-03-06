package com.github.agaro1121.http.ladders

import cats.data.ValidatedNel
import com.github.agaro1121.common.PathOfExileTestSuite
import com.github.agaro1121.exception.{BadLadderEndpointArgument, HttpError}
import com.github.agaro1121.models.ladder.Ladder
import scala.concurrent.Future

//TODO add tests for good combinations of query params
class LadderTest
  extends PathOfExileTestSuite {

  "Ladder Test" should {

    "get a 200(Ok) and unmarshal to `Ladder` " in {
      val response: ValidatedNel[BadLadderEndpointArgument, Future[Either[HttpError, Ladder]]] =
        pathOfExileClient.getLadder("Hardcore")

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
