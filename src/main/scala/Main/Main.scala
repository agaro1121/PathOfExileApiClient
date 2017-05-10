package Main

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import config.Config
import exception.HttpException
import http.client.PathOfExileHttpClient
import models.ApiResponse

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import language.postfixOps

object Main extends App {

  implicit val actorSystem = ActorSystem("PathOfExile")
  implicit val materializer = ActorMaterializer()

  val client = PathOfExileHttpClient(Config.fromReference)

//   Latest Stash
//  private val response: Future[Either[HttpException, ApiResponse]] = client.getApiResponse(Some("65969231-69565137-65101701-75690944-70363924"))
  private val response: Future[Either[HttpException, ApiResponse]] = client.getApiResponse

  val result: Either[HttpException, ApiResponse] = Await.result(response, 10 seconds)

  println(result)
}
