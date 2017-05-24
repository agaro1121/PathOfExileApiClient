package actors

import java.util.UUID

import akka.actor.{Actor, Props}

object RequestOwner {
  case class StartNewJob(jobId: UUID)

  def props = Props[RequestOwner]
}

/*
* TODO: Create PathOfExileClientActor
* TODO: Finish this class
* TODO: Write test
* */
class RequestOwner extends Actor {
  import RequestOwner._

  override def receive: Receive = {
    case StartNewJob(id) =>
      /*
      * Kick off a call on a PathOfExileClientActor
      * */
      ???
  }
}
