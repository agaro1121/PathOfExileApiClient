package http.client

import akka.Done
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.stream.Materializer
import config.Config

import scala.concurrent.Future

case class HttpClient(config: Config)
                     (implicit actorSystem: ActorSystem, materializer: Materializer) {

  import actorSystem.dispatcher

  private def sendRequest(): Future[HttpResponse] = {
    val request = HttpRequest(uri = Uri(config.url))
    Http().singleRequest(request = request)
  }

  private def handleResponse(response: Future[HttpResponse]): Future[Done] = {
    response.flatMap {
      httpResponse =>
        println(httpResponse.headers)
        httpResponse.status match {
          case StatusCodes.OK =>
            httpResponse.entity.dataBytes.map(_.utf8String).runForeach(println)
          case _ =>
            httpResponse.entity.dataBytes.map(_.utf8String).runForeach(println)
            throw new Exception(s"Not a 200 response")
        }
    }.recover {
      case throwable => throw throwable
    }
  }

  def getJson: Future[Done] = handleResponse(sendRequest())

}
