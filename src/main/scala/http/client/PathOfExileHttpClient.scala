package http.client

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.stream.Materializer
import config.Config
import models.ApiResponse
import marshalling.CirceMarshalling._
import scala.concurrent.Future
import cats.implicits._

class PathOfExileHttpClient(config: Config)(implicit actorSystem: ActorSystem, materializer: Materializer) {

  import actorSystem.dispatcher

  private def getResponse: Future[HttpResponse] = {
    val request = HttpRequest(uri = Uri(config.url))
    Http().singleRequest(request = request)
  }

  private def handleResponse(response: Future[HttpResponse]): Future[Either[Future[String], Future[ApiResponse]]] = {
    response.map {
      httpResponse =>
        httpResponse.status match {
          case StatusCodes.OK =>
            Right(Unmarshal(httpResponse.entity).to[ApiResponse])

          case _ =>
            Left(Unmarshal(httpResponse.entity).to[String])
        }
    }.recover {
      case throwable => Left(Future.successful(throwable.getMessage)) //FIXME: uhhh???? LOL
    }
  }

  def getApiResponse: Future[Either[String, ApiResponse]] = handleResponse(getResponse).map(_.bisequence).flatten

}

object PathOfExileHttpClient {
  def apply(config: Config)(implicit actorSystem: ActorSystem, materializer: Materializer): PathOfExileHttpClient =
    new PathOfExileHttpClient(config)
}