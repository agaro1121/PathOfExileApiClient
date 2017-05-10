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
import exception.{BadHttpStatusException, GeneralHttpException, HttpException}

class PathOfExileHttpClient(config: Config)(implicit actorSystem: ActorSystem, mat: Materializer) {

  import actorSystem.dispatcher

  private def getResponse(stashId: Option[String] = None): Future[HttpResponse] = {
    val url =
      if (stashId.isDefined) s"${config.url}?id=${stashId.get}"
      else config.url

    Http().singleRequest(request = HttpRequest(uri = url))
  }

  private def handleResponse(response: Future[HttpResponse]): Future[Either[Future[HttpException], Future[ApiResponse]]] = {
    response.map {
      httpResponse =>
        httpResponse.status match {
          case StatusCodes.OK =>
            Right(Unmarshal(httpResponse.entity).to[ApiResponse])

          case _ =>
            Left(
              Unmarshal(httpResponse.entity)
                .to[String]
                .map(BadHttpStatusException(httpResponse.status, _))
            )
        }
    }.recover {
      case throwable => Left(Future.successful(GeneralHttpException(throwable.getMessage)))
    }
  }

  def getApiResponse: Future[Either[HttpException, ApiResponse]] =
    handleResponse(getResponse()).flatMap(_.bisequence)

  def getApiResponse(stashId: Option[String]): Future[Either[HttpException, ApiResponse]] =
    handleResponse(getResponse(stashId)).flatMap(_.bisequence)

}

object PathOfExileHttpClient {
  def apply(config: Config)(implicit actorSystem: ActorSystem, mat: Materializer): PathOfExileHttpClient =
    new PathOfExileHttpClient(config)
}
