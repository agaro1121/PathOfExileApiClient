package actors

import akka.actor.ActorSystem
import akka.testkit.TestKit
import org.scalatest.{Matchers, Pending, WordSpecLike}

class RequestManagerTest extends TestKit(ActorSystem("RequestManagerTest"))
  with WordSpecLike with Matchers {

  "A RequestManager" should {

    "create a new secretary per job" in {
      Pending
    }

    "send a message to the new secretary upon new job request" in {
      Pending
    }

  }


}
