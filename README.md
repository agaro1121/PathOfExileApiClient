# PathOfExileApiClient

## Description

Path of exile provides an api for downloading the following:
- Stashes
- PvP Matches
- League(s)
- Ladder
- League Rules

This client knows how to talk to those APIs.  
Just simply provide an actor system and Materializer


## Usage
```scala
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import http.client.PathOfExileHttpClient
import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps

object Main extends App {

  implicit val actorSystem = ActorSystem("system")
  implicit val mat = ActorMaterializer()

  val client = PathOfExileHttpClient()

  val stashesResponse = client.getStashes()

  val result = Await.result(stashesResponse, 5 seconds)

  result match {
    case Left(httpError) => println(httpError)
    case Right(stashes) => println(stashes)
  }
  
}

```
