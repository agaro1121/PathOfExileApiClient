package actors

import akka.actor.{ActorRefFactory, ActorSystem, PoisonPill, Props}
import akka.testkit.{ImplicitSender, TestActorRef, TestKit, TestProbe}
import org.scalatest.{Matchers, WordSpecLike}

import scala.language.postfixOps

class RequestManagerTest extends TestKit(ActorSystem("RequestManagerTest"))
  with WordSpecLike with Matchers with ImplicitSender {

  val fakeChild = TestProbe("TestProbe")

  "A RequestManager" should {

    "create a new secretary per job" in {
      val requestOwner: TestActorRef[RequestOwner] =
        TestActorRef(Props(classOf[RequestOwner], (_: ActorRefFactory) => fakeChild.ref), "RequestOwner")

      val requestManager: TestActorRef[RequestManager] =
        TestActorRef(Props(classOf[RequestManager], (_: ActorRefFactory) => requestOwner), "RequestManager")

      requestManager ! RequestManager.StartNewJob
      requestManager.underlyingActor.secretaries.size shouldBe 1
      requestManager.underlyingActor.context.children.size shouldBe 0
    }

    "send message to new secretary upon new job request" in {
      val requestManager: TestActorRef[RequestManager] =
        TestActorRef(Props(classOf[RequestManager], (_: ActorRefFactory) => fakeChild.ref), "RequestManager")

      requestManager ! RequestManager.StartNewJob
      fakeChild.expectMsgPF(){
        case RequestOwner.StartNewJob(_) => true
      }
    }

    "watch the lifecycle of a new secretary" in {
      val requestOwner: TestActorRef[RequestOwner] =
        TestActorRef(Props(classOf[RequestOwner], (_: ActorRefFactory) => fakeChild.ref), "RequestOwner")

      val requestManager: TestActorRef[RequestManager] =
        TestActorRef(Props(classOf[RequestManager], (_: ActorRefFactory) => requestOwner), "RequestManager")

      requestManager ! RequestManager.StartNewJob
      requestManager.underlyingActor.secretaries.size shouldBe 1

      requestOwner ! PoisonPill
      requestManager.underlyingActor.secretaries.size shouldBe 0
    }

  }

}
