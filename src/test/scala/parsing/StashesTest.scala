package parsing

import java.io.File
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.FileIO
import akka.util.ByteString
import io.circe.Decoder.Result
import io.circe.ParsingFailure
import org.scalatest.{Matchers, WordSpec}
import io.circe.parser._
import marshalling.StashesMarshalling
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.language.postfixOps
import models.stashes.Stashes

// TODO: Make this a proper test
class StashesTest extends WordSpec with Matchers with StashesMarshalling {

  "Api Response" should {

    "deserialize response successfully" in {
      import MockPayloads.stashes
      val json = parse(stashes)
      val apiResponse: Either[ParsingFailure, Result[Stashes]] = json.map(_.as[Stashes])
      println(apiResponse)
    }

    "deserialize response2 successfully" in {
      implicit val actorSystem = ActorSystem("test")
      implicit val mat = ActorMaterializer()
      import actorSystem.dispatcher

      val path = getClass.getResource("/ApiResponse.txt").getPath
      val file = new File(path)


      val response: Future[String] = FileIO.fromPath(file.toPath)
        .runFold(ByteString.empty)(_ ++ _)
        .map(_.utf8String)

      val resp = Await.result(response, 5 seconds)
      val json = parse(resp)
      val apiResponse = json.map(_.as[Stashes])
      println(apiResponse)

    }

    "deserialize response3 successfully" in {
      implicit val actorSystem = ActorSystem("test")
      implicit val mat = ActorMaterializer()
      import actorSystem.dispatcher

      val path = getClass.getResource("/ApiResponse2.txt").getPath
      val file = new File(path)


      val response: Future[String] = FileIO.fromPath(file.toPath)
        .runFold(ByteString.empty)(_ ++ _)
        .map(_.utf8String)

      val resp = Await.result(response, 5 seconds)
      val json = parse(resp)
      val apiResponse = json.map(_.as[Stashes])
      println(apiResponse)

    }

  }

}
