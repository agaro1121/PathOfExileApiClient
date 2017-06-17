package com.github.agaro1121.parsing

import com.github.agaro1121.common.PathOfExileTestSuite
import io.circe.parser._
import com.github.agaro1121.models.leagues.{League, Leagues}
import com.github.agaro1121.marshalling.LeaguesMarshalling

class LeaguesTest
  extends PathOfExileTestSuite
  with LeaguesMarshalling {

  "League" should {
    "be parsed successfully" in {
      val json = parse(payloads.League.payload)
      val leagueParseResult = json.map(_.as[League])
      leagueParseResult.isRight shouldBe true
      leagueParseResult.foreach{
        decoderResult =>
          decoderResult.isRight shouldBe true
          decoderResult.foreach {
            league =>
              league.id shouldBe "Hardcore"
          }

      }
    }
  }

  "Leagues" should {
    "be parsed successfully" in {
      val json = parse(payloads.Leagues.payload)
      val leaguesParseResult = json.map(_.as[Leagues])
      leaguesParseResult.isRight shouldBe true
      leaguesParseResult.foreach{ decoderResult =>
        decoderResult.isRight shouldBe true
        decoderResult.foreach{ leagues =>
          leagues.leagues.map(_.id) should contain allOf(
            "Standard", "Hardcore", "Default097",
              "Hardcore097", "Jan30 3h Rush HC",
              "Feb13 HC Unique Rush", "A6 LAN Event",
              "Feb26 HC Ladder Rush", "Mar4 HC Ladder Rush",
              "Mar11 HC Ladder Rush", "Mar18 HC Ladder Rush",
              "GGG Private", "Abandoned", "Mar25 HC Ladder Rush",
              "Default098", "Hardcore098", "Event #1", "Event #2",
              "Event #3", "Event #4", "Apr14 HC Ladder Rush",
              "Cut-throat1", "Cut-throat2", "Cut-throat3",
              "Cut-throat", "90m HC Cut-throat", "Migrating to Legacy",
              "Migrating to HC Legacy", "Event 1", "Event 2", "Event 3",
              "Event 4", "June 17 3h HC Race", "June 24 3h HC Race",
              "July 1 3h HC Race", "temp", "RipTenTV Race 1",
              "July 8 3h HC Race", "July 15 3h HC Race",
              "July 22 3h HC Race", "2 Week HC Race", "Weekend Event #1",
              "Weekend Event #2", "Weekend Event #3", "Weekend Event #4",
              "One Hour Cut-throat1", "Aug 5 3h HC Race", "One Hour Cut-throat2",
              "One Hour Cut-throat3", "Aug 12 3h HC Race")
        }
      }
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
      val leagueParseResult = json.map(_.as[League])
      leagueParseResult.foreach{
        parseResult =>
          parseResult.foreach{
            league => league.id shouldBe "48 Hour Flashback Solo (MDC101)"
          }
      }
    }

  }

}
