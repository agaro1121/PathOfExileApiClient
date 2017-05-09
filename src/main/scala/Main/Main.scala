package Main

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import config.Config
import http.client.PathOfExileHttpClient
import models.ApiResponse
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import language.postfixOps

object Main extends App {

  implicit val actorSystem = ActorSystem("PathOfExile")
  implicit val materializer = ActorMaterializer()

  val client = PathOfExileHttpClient(Config.fromReference)

  //TODO: Create error types so it's `Either[Error, ApiResponse]` instead
  private val response: Future[Either[String, ApiResponse]] = client.getApiResponse

  val result: Either[String, ApiResponse] = Await.result(response, 10 seconds)

  println(result)


}
