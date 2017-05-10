package parsing

import java.io.File
import java.nio.file.Paths

import akka.actor.ActorSystem
import akka.http.scaladsl.model.Uri.Path
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.FileIO
import akka.util.ByteString
import io.circe.{Json, ParsingFailure}
import org.scalatest.{Matchers, WordSpec}
import io.circe.parser._
import models.{ApiResponse, Item, Property}
import marshalling.CirceMarshalling._

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.io.BufferedSource
import scala.language.postfixOps

class ParsingTest extends WordSpec with Matchers {

  "Api Response" should {

    "deserialize response successfully" in {
      import MockPayload.response
      val json = parse(response)
      val apiResponse = json.map(_.as[ApiResponse])
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
      val apiResponse = json.map(_.as[ApiResponse])
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
      val apiResponse = json.map(_.as[ApiResponse])
      println(apiResponse)

    }

  }

}
