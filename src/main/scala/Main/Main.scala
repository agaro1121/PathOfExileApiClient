package Main

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import config.Config
import http.client.PathOfExileHttpClient
import scala.concurrent.Await
import scala.concurrent.duration._
import language.postfixOps

object Main extends App {

  implicit val actorSystem = ActorSystem("PathOfExile")
  implicit val materializer = ActorMaterializer()

  val client = PathOfExileHttpClient(Config.fromReference)

  private val response = client.getApiResponse

  val result = Await.result(response, 10 seconds)

  println(result)


}
