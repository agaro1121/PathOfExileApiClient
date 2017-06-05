package parsing

import org.scalatest.{Matchers, WordSpec}
import io.circe.parser._
import models.leagues.{League, Leagues}
import io.circe.syntax._
import cats.syntax.option._
import marshalling.LeaguesMarshalling

// TODO: Make this a proper test
class LeaguesTest extends WordSpec with Matchers with LeaguesMarshalling {

  "League" should {
    "be parsed successfully" in {
      val jsonString =
        """
          | {
          |        "id": "Medallion (MDS087b)",
          |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1710262",
          |        "startAt": "2016-08-10T04:00:00Z",
          |        "endAt": "2016-08-10T05:00:00Z"
          |    }
        """.stripMargin
      val json = parse(jsonString)
      val leaguesApiResponse = json.map(_.as[League])
      println(leaguesApiResponse)
    }
  }

  "Leagues" should {
    "be parsed successfully" in {
      import MockPayloads.leagues
      val json = parse(leagues)
      val leaguesApiResponse = json.map(_.as[Leagues])
      println(leaguesApiResponse)
    }


    "can parse null values" in {
      val jsonString = """
        |{
        |    "id": "48 Hour Flashback Solo (MDC101)",
        |    "url": null,
        |    "startAt": "2016-08-12T23:00:00Z",
        |    "endAt": null
        |}
      """.stripMargin

      val json = parse(jsonString)
      val league = json.map(_.as[League])
      println(league)
    }

    "encode Leagues" in {
      val league = League("48 Hour Flashback Solo (MDC101)", None, "2016-08-12T23:00:00Z".some, None, "description", None, List.empty, false, None)
      val leagues = Leagues(List(league))
      val json = leagues.asJson

      val jsonString = """
                         |[
                         |  {
                         |      "id": "48 Hour Flashback Solo (MDC101)",
                         |      "url": null,
                         |      "startAt": "2016-08-12T23:00:00Z",
                         |      "endAt": null
                         |  }
                         |]
                       """.stripMargin

      val expectedJson = parse(jsonString)

      json shouldBe expectedJson.right.get
    }

  }

}
