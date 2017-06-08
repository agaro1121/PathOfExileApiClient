# Path Of Exile Api Client

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

## Endpoint Argument Validation
- The client will tell you if your arguments don't follow the proper rules
```scala
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import cats.data.Validated.{Invalid, Valid}
import http.client.PathOfExileHttpClient
import scala.concurrent.duration._
import scala.language.postfixOps
import scala.concurrent.Await

object Main extends App {

  implicit val actorSystem = ActorSystem("system")
  implicit val mat = ActorMaterializer()

  val client = PathOfExileHttpClient()

  val clientResponse = 
    client.getLeague("Hardcore", ladder = Some(5), ladderOffset = Some(5), ladderTrack = Some(5))

  clientResponse match {
    case Valid(poeResponse) =>
    
      val result = Await.result(poeResponse, 5 seconds)
      result match {
        case Left(httpError) => println(httpError)
        case Right(league) => println(league)
      }
      
    case Invalid(errors) => println(errors)
  }


}

/*
* 
* Results
* 
* NonEmptyList(
*   BadLadder(The value of ladder can only be zero or 1),
*   BadLadderLimit(LadderOffset can only be set when ladder is 1),
*   BadLadderTrack(LadderTrack can only be set when ladder is 1)
* )
* 
* */
```
