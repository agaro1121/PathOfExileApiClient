package com.github.agaro1121.parsing.payloads

object LeagueRules {

  val payload =
    """[
      |  {
      |    "id": 2,
      |    "name": "Private",
      |    "description": "League requires a password to join."
      |  },
      |  {
      |    "id": 4,
      |    "name": "Hardcore",
      |    "description": "A character killed in Hardcore is moved to its parent league."
      |  },
      |  {
      |    "id": 6,
      |    "name": "Drop equipped items on death",
      |    "description": "Items are dropped on death."
      |  },
      |  {
      |    "id": 7,
      |    "name": "Instance invasion",
      |    "description": "Allows you to select other people's instances in the instance manager."
      |  },
      |  {
      |    "id": 8,
      |    "name": "Harsh death experience penalty",
      |    "description": "Increases the death experience penalty by 30% on all difficulty levels."
      |  },
      |  {
      |    "id": 10,
      |    "name": "Hostile by default",
      |    "description": "Non-partymembers are hostile by default when you are not partied."
      |  },
      |  {
      |    "id": 11,
      |    "name": "Death penalty awarded to slayer",
      |    "description": "When killing a player, their death penalty is awarded to the player doing the killing."
      |  },
      |  {
      |    "id": 12,
      |    "name": "Increased player caps",
      |    "description": "Doubles player capacity in non-town instances. Does not increase the party size."
      |  },
      |  {
      |    "id": 26,
      |    "name": "Turbo",
      |    "description": "Monsters move, attack and cast 60% faster."
      |  },
      |  {
      |    "id": 24,
      |    "name": "Solo",
      |    "description": "You may not party in this league."
      |  }
      |]""".stripMargin

}
