package actors

import java.util.UUID

import akka.actor.{Actor, ActorRef, ActorRefFactory, Props}
import akka.event.LoggingReceive

object RequestOwner {
  def props = Props[RequestOwner]

  case class StartNewJob(jobId: UUID)

}

/*
* TODO: Create PathOfExileClientActor
* TODO: Finish this class
* TODO: Write test
* */
class RequestOwner(childMaker: ActorRefFactory => ActorRef) extends Actor {
  import RequestOwner._

  override def receive: Receive = LoggingReceive {
    case StartNewJob(id) =>
      sender() ! RequestManager.NewJobStarted(id)
      /*
      * Kick off a call on a PathOfExileClientActor
      * */
  }
}
