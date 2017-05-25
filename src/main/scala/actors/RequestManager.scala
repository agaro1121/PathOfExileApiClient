package actors

import java.util.UUID

import akka.actor.{Actor, ActorRef, ActorRefFactory}

import Map.empty
import RequestManager._
import akka.event.LoggingReceive

object RequestManager {
  case object StartNewJob
  case class NewJobStarted(id: UUID)
  type JobId = UUID
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
      /*
      * TODO: Test watch functionality
      * TODO: add methods in receive function to check if secretaries die
      * */
      context.watch(requestOwner)
      secretaries += jobId -> requestOwner
  }
}
