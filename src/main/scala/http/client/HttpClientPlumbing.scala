package http.client

import akka.actor.ActorSystem
import akka.http.scaladsl.{Http, HttpExt}
import akka.http.scaladsl.model._
import akka.http.scaladsl.model.Uri.{Path, Query}
import akka.http.scaladsl.unmarshalling.{Unmarshal, Unmarshaller}
import akka.stream.Materializer
import cats.data.EitherT
import com.typesafe.scalalogging.LazyLogging
import config.PathOfExileHttpConfig
import exception.{BadHttpStatus, GeneralHttpException, HttpError}
import io.circe.Decoder
import cats.implicits._
import scala.concurrent.{ExecutionContext, Future}

trait HttpClientPlumbing extends LazyLogging {

  protected implicit def genericFromJsonConverter = HttpClientPlumbing.syntax.GenericFromJsonConverter _
  protected def httpClient: HttpExt = Http()
  protected def config: PathOfExileHttpConfig
  protected implicit def actorSystem: ActorSystem
  protected implicit def mat: Materializer
  protected implicit val ec: ExecutionContext = actorSystem.dispatcher

  protected def getAndHandleResponse(endpoint: String, queryParams: Option[Map[String, String]] = None): Future[Either[Future[HttpError], ResponseEntity]] =
    handleResponse(getResponse(endpoint, queryParams))

  protected def handleResponse(response: Future[HttpResponse]): Future[Either[Future[HttpError], ResponseEntity]] = {
    response.map {
      httpResponse =>
        httpResponse.status match {
          case StatusCodes.OK =>
            Right(httpResponse.entity)

          case _ =>
            Left(
              Unmarshal(httpResponse.entity)
                .to[String]
                .map { body =>
                  BadHttpStatus(httpResponse.status, body)
                }
            )
        }
    }.recover {
      case throwable =>
        Left(Future.successful(GeneralHttpException(throwable.getMessage)))
    }
  }

  protected def getResponse(endpoint: String, queryParams: Option[Map[String, String]]): Future[HttpResponse] =
    httpClient.singleRequest(request = createHttpRequest(config.`api-url`, endpoint, queryParams))

  protected def createHttpRequest(apiUrl: String, endpoint: String, queryParams: Option[Map[String, String]]): HttpRequest = {
    val uri = Uri(apiUrl).withPath(Path(endpoint)).withQuery(Query(queryParams.getOrElse(Map.empty[String, String])))
    logger.info(s"Calling url=$uri")
    HttpRequest(uri = uri)
  }

}

object HttpClientPlumbing {
  object syntax {
    implicit class GenericFromJsonConverter(val response: Future[Either[Future[HttpError], ResponseEntity]]) extends AnyVal {
      def as[T: Decoder](implicit mat: Materializer, um: Unmarshaller[ResponseEntity, T], ec: ExecutionContext) = {
        EitherT(response).map(httpResponse => Unmarshal(httpResponse).to[T]).value.flatMap(_.bisequence) //TODO: Recover here
      }
    }
  }
}