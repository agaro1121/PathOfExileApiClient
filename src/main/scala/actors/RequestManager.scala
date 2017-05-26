package actors

import java.util.UUID
import akka.actor.{Actor, ActorRef, ActorRefFactory, Terminated}
import Map.empty
import RequestManager._
import akka.event.LoggingReceive

object RequestManager {
  type JobId = UUID
  case object StartNewJob
  case class NewJobStarted(id: JobId)
}

class RequestManager(childMaker: ActorRefFactory => ActorRef) extends Actor {

  var secretaries: Map[JobId, ActorRef] = empty

  override def receive: Receive = LoggingReceive {

    case StartNewJob =>
      val requestOwner = childMaker(context)
      val jobId = UUID.randomUUID()
      requestOwner ! RequestOwner.StartNewJob(jobId)

    case NewJobStarted(jobId) =>
      val requestOwner = sender()
      context.watch(requestOwner)
      secretaries += jobId -> requestOwner

      /*
      * TODO: Can the deadSecretary have it's state recovered ???
      * Maybe save actor's state using Akka Persistence ???
      * */
    case Terminated(deadSecretary) =>
      secretaries.find {
        case (_, secretary) =>
          secretary == deadSecretary
      } foreach {
        case (jobId, _) =>
          secretaries -= jobId
      }

  }
}
