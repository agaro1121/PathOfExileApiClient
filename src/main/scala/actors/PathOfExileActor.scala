package actors

import akka.actor.Actor
import akka.stream.ActorMaterializer
import http.client.PathOfExileHttpClient
import com.typesafe.scalalogging.LazyLogging
import config.PathOfExileHttpConfig

object PathOfExileActor {
  case class GetStash(stashId: Option[String])
}

class PathOfExileActor extends Actor with LazyLogging {
  import PathOfExileActor._

  implicit val sys = context.system
  import sys.dispatcher
  implicit val mat = ActorMaterializer()
  val client = PathOfExileHttpClient()

  override def receive: Receive = {

    case GetStash(optionalStashId) =>
      val requestOwner = sender()
      val stashId = optionalStashId
      var retries = PathOfExileHttpConfig.default.retries

      client.getStashes(optionalStashId)
        .foreach {
          case Left(exception) =>
            if (retries > 0) {
              logger.error(s"Something went wrong with the api call for Stash($stashId). Going to try again", exception)
              retries -= 1
              self ! GetStash(stashId)
            } else
              logger.error(s"Something went wrong with the api call for Stash($stashId)", exception)

          case Right(apiResponse) => requestOwner ! RequestOwner.NextStashId(apiResponse.next_change_id)
        }

  }
}
