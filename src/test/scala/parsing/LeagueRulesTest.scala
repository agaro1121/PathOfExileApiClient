package parsing

import common.PathOfExileTestSuite
import marshalling.LeagueRulesMarshalling
import models.leaguerules.{LeagueRule, LeagueRules}
import io.circe.parser._

class LeagueRulesTest
  extends PathOfExileTestSuite
  with LeagueRulesMarshalling {

  "League Rules" should {
    "unmarshal successfully" in {

      val json = parse(payloads.LeagueRules.payload)
      val leagueRulesParseResult = json.map(_.as[LeagueRules])
      println(leagueRulesParseResult)
      leagueRulesParseResult.isRight shouldBe true
      leagueRulesParseResult.foreach { decoderResult =>
        decoderResult.isRight shouldBe true
        decoderResult.foreach{ leagueRules =>
          leagueRules.leagueRules.head.description shouldBe "League requires a password to join."
        }
      }
    }
  }

  "League Rule" should {
    "unmarshal successfully" in {

      val json = parse(payloads.LeagueRule.payload)
      val leagueRuleParseResult = json.map(_.as[LeagueRule])
      println(leagueRuleParseResult)
      leagueRuleParseResult.isRight shouldBe true
      leagueRuleParseResult.foreach { decoderResult =>
        decoderResult.isRight shouldBe true
        decoderResult.foreach{ leagueRule =>
          leagueRule.description shouldBe "A character killed in Hardcore is moved to its parent league."
        }
      }
    }
  }


}
