package actors

import java.util.UUID
import akka.actor.{Actor, ActorRef, ActorRefFactory, Props}
import akka.event.LoggingReceive
import List.empty

object RequestOwner {
  def props = Props[RequestOwner]

  case class StartNewJob(jobId: UUID)
  case class NextStashId(id: String)

}

/*
* TODO: Create PathOfExileClientActor
* TODO: Finish this class
* TODO: Write test
* */
class RequestOwner(childMaker: ActorRefFactory => ActorRef) extends Actor {
  import RequestOwner._

  var idQueue: List[String] = empty

  override def receive: Receive = LoggingReceive {
    case StartNewJob(id) =>
      sender() ! RequestManager.NewJobStarted(id)
      /*
      * TODO: Kick off a call on a PathOfExileClientActor
      * */

    case NextStashId(id) => id :: idQueue
  }
}
