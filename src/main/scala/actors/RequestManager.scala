package actors

import java.util.UUID
import akka.actor.{Actor, ActorRef}
import shapeless.tag.@@
import Map.empty

object RequestManager {
  case object StartNewJob
  case class NewJobStarted(id: UUID)
  type JobId = UUID
  type JobOwner = ActorRef @@ RequestOwner
}

/*
* How to test:
* 1) Check internal state of actor
* 2) Intercept message?
* 3) Refer to Akka In Action
* TODO: Test
* */
class RequestManager extends Actor {
  import RequestManager._

  var secretaries: Map[JobId, JobOwner] = empty

  override def receive: Receive = {

    case StartNewJob =>
      val requestOwner = context.actorOf(RequestOwner.props)
      val jobId = UUID.randomUUID()
      secretaries += jobId -> requestOwner
      requestOwner ! RequestOwner.StartNewJob(jobId)

  }
}
