package http.stashes

import common.PathOfExileTestSuite


class StashesTest
  extends PathOfExileTestSuite {

  "Stashes live response" should {

    "get a 200(Ok) and unmarshal to `Stashes` " in {
      val response = pathOfExileClient.getStashes()

      whenReady(response){ result =>
        withClue(s"result was: $result") {
          result.isRight shouldBe true
        }
      }
    }

  }

}

