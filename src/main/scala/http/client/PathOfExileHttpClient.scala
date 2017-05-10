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
            println("*** status OK")
            Right(Unmarshal(httpResponse.entity).to[ApiResponse])

          case _ =>
            println("*** Not 200 response")
            Left(
              Unmarshal(httpResponse.entity)
                .to[String]
                .map{ body =>
                  println(s"body=$body")
                  BadHttpStatusException(httpResponse.status, body)
                }
            )
        }
    }.recover {
      case throwable =>
        println(s"*** throwable=${throwable.getMessage}")
        println(s"*** stack trace=\n${throwable.getStackTrace.mkString("\n")}")

        Left(Future.successful(GeneralHttpException(throwable.getMessage)))
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
