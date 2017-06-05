package parsing

import java.io.File
import akka.stream.scaladsl.FileIO
import akka.util.ByteString
import common.PathOfExileTestSuite
import io.circe.parser._
import marshalling.StashesMarshalling
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.language.postfixOps
import models.stashes.Stashes

class StashesTest
  extends PathOfExileTestSuite
    with StashesMarshalling {

  "Stashes" should {

    "unmarshal successfully" in {
      val path = getClass.getResource("/stashes.json").getPath
      val file = new File(path)

      val response: Future[String] = FileIO.fromPath(file.toPath)
        .runFold(ByteString.empty)(_ ++ _)
        .map(_.utf8String)

      val jsonString = Await.result(response, 5 seconds)
      val json = parse(jsonString)
      val stashes = json.map(_.as[Stashes])
      stashes.isRight shouldBe true
      stashes.foreach{ decoderResult =>
        decoderResult.isRight shouldBe true
        decoderResult.foreach{ stashes =>
          stashes.next_change_id shouldBe "2300-4356-3413-4616-1295"
          stashes.stashes.head.accountName shouldBe Some("Nightlines")
        }
      }
    }

  }

}
