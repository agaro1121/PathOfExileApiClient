package Main

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import config.Config
import http.client.HttpClient

object Main extends App {

  implicit val actorSystem = ActorSystem("PathOfExile")
  implicit val materializer = ActorMaterializer()
  import actorSystem.dispatcher

  val client = HttpClient(Config.fromReference)
  private val json = client.getJson

  json
    .flatMap { done =>
      println(done)
      actorSystem.terminate()
    }
    .onComplete(println)

}
