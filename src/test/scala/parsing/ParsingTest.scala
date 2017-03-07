package parsing

import de.heikoseeberger.akkahttpcirce.CirceSupport
import io.circe.Decoder.Result
import org.scalatest.{Matchers, WordSpec}
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import models.{ApiResponse, Item, Property}
import shapeless.HNil
import shapeless.::
import io.circe.shapes._

class ParsingTest extends WordSpec with Matchers {

  "Short api response" should {
    "deserialize short response successfully" in {
      import MockPayload.responseShort
      val json: Either[ParsingFailure, Json] = parse(responseShort)
      val apiResponse = json.map(_.as[ApiResponse])
      // println(apiResponse)
    }

    "deserialize medium response successfully" in {
      import MockPayload.responseMedium
      val json: Either[ParsingFailure, Json] = parse(responseMedium)
      val apiResponse = json.map(_.as[ApiResponse])
      // println(apiResponse)
    }

    "deserialize response successfully" in {
      import MockPayload.response
      val json= parse(response)
      val apiResponse = json.map(_.as[ApiResponse])
      println(apiResponse)
    }

    "deserialize Property successfully" in {
      import MockPayload.property
      val res = parse(property).map(_.as[Property[String :: Int :: HNil]])
      // println(res)
    }

    "deserialize item successfully" in {
      import MockPayload.item
      val json: Either[ParsingFailure, Json] = parse(item)
      val apiResponse = json.map(_.as[Item])
      // println(apiResponse)
    }
  }

}
