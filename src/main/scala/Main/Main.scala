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
import scala.annotation.tailrec

object Main extends App {

  implicit val actorSystem = ActorSystem("PathOfExile")
  implicit val materializer = ActorMaterializer()
  import actorSystem.dispatcher

  val client = PathOfExileHttpClient(Config.fromReference)

  private val currentId = "65978931-69574691-65109433-75701688-70373342"
  //   Latest Stash
//  private val response: Future[Either[HttpException, ApiResponse]] = client.getApiResponse(Some("65969231-69565137-65101701-75690944-70363924"))
  private val response: Future[Either[HttpException, ApiResponse]] = client.getApiResponse(Some(currentId))
//  private val response: Future[Either[HttpException, ApiResponse]] = client.getApiResponse

    response.foreach(_.foreach(api => loop(api, currentId)))

  def loop(currentResponse: ApiResponse, lastId: String): Unit = {
    val currentChangeId = currentResponse.next_change_id
    currentChangeId match {
      case "0" => println("FOUND ZERO!")
      case "" => println("EMPTY???")
      case s if s == lastId =>
        println(s"ID IS SAME AS LAST lastId=$lastId and current=$s")
      case _ =>
        println(s"NEXT CHANGE ID=$currentChangeId")
        client.getApiResponse(Some(currentChangeId)).map(either => either.foreach(api => loop(api, currentChangeId)))
    }
  }

  readLine()
}
