package actors

import akka.actor.Actor
import akka.stream.ActorMaterializer
import http.client.PathOfExileHttpClient
import cats.data.EitherT
import cats.implicits.catsStdInstancesForFuture

object PathOfExileActor {
  case class GetStash(stashId: Option[String])
}

class PathOfExileActor extends Actor {
  import PathOfExileActor._

  implicit val sys = context.system
  import sys.dispatcher
  implicit val mat = ActorMaterializer()
  val client = PathOfExileHttpClient()


  override def receive: Receive = {

    case GetStash(optionalStashId) =>
      client.getApiResponse(optionalStashId)
      .flatMap {
        case Left(ex) =>
          // TODO: log the error
          client.getApiResponse(optionalStashId)
        case Right(apiResponse) => ???
      }


  }
}
