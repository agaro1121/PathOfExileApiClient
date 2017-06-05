package parsing.payloads

object Leagues {

  val payload =
    """
      |[
      |  {
      |    "id": "Standard",
      |    "description": "The default game mode.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": "http://pathofexile.com/forum/view-thread/71278",
      |    "startAt": "2013-01-23T21:00:00Z",
      |    "endAt": null,
      |    "rules": []
      |  },
      |  {
      |    "id": "Hardcore",
      |    "description": "A character killed in the Hardcore league is moved to the Standard league.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": "http://pathofexile.com/forum/view-thread/71276",
      |    "startAt": "2013-01-23T21:00:00Z",
      |    "endAt": null,
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Default097",
      |    "description": "The default game mode.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": null,
      |    "endAt": null,
      |    "rules": []
      |  },
      |  {
      |    "id": "Hardcore097",
      |    "description": "A character killed in the Hardcore league is moved to the Default league.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": null,
      |    "endAt": null,
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Jan30 3h Rush HC",
      |    "description": "A 3 hour hardcore ladder rush with prizes. See the forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-01-29T21:00:00Z",
      |    "endAt": "2012-01-30T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Feb13 HC Unique Rush",
      |    "description": "A 3 hour hardcore ladder rush with unique prizes. See the forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-02-12T21:00:00Z",
      |    "endAt": "2012-02-13T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "A6 LAN Event",
      |    "description": "A private league for the A6 LAN tournament. Requires password.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-02-18T07:00:03Z",
      |    "endAt": "2012-02-18T08:30:03Z",
      |    "rules": [
      |      {
      |        "id": 2,
      |        "name": "Private",
      |        "description": "League requires a password to join."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Feb26 HC Ladder Rush",
      |    "description": "A 3 hour hardcore ladder rush with prizes. See the forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-02-25T21:00:00Z",
      |    "endAt": "2012-02-26T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Mar4 HC Ladder Rush",
      |    "description": "A 3 hour hardcore ladder rush with prizes. See the forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-03-03T21:00:00Z",
      |    "endAt": "2012-03-04T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Mar11 HC Ladder Rush",
      |    "description": "A 3 hour ladder rush with prizes. See the forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-03-10T21:00:00Z",
      |    "endAt": "2012-03-11T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Mar18 HC Ladder Rush",
      |    "description": "A 3 hour ladder rush with prizes. See the forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-03-17T21:00:00Z",
      |    "endAt": "2012-03-18T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "GGG Private",
      |    "description": "A private league for stress-testing the realm with bots",
      |    "registerAt": null,
      |    "event": false,
      |    "url": "http://pathofexile.com/forum/view-thread/63351",
      |    "startAt": null,
      |    "endAt": null,
      |    "rules": [
      |      {
      |        "id": 2,
      |        "name": "Private",
      |        "description": "League requires a password to join."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Abandoned",
      |    "description": "A 3 hour ladder rush with prizes. See the forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-03-24T21:00:00Z",
      |    "endAt": "2012-03-24T21:24:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Mar25 HC Ladder Rush",
      |    "description": "A 3 hour ladder rush with prizes. See the forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-03-24T21:30:00Z",
      |    "endAt": "2012-03-25T00:30:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Default098",
      |    "description": "The default game mode.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": null,
      |    "endAt": null,
      |    "rules": []
      |  },
      |  {
      |    "id": "Hardcore098",
      |    "description": "A character killed in the Hardcore league is moved to the Default league.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": null,
      |    "endAt": null,
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Event #1",
      |    "description": "A 2 hour race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-03-31T03:00:00Z",
      |    "endAt": "2012-03-31T05:00:00Z",
      |    "rules": []
      |  },
      |  {
      |    "id": "Event #2",
      |    "description": "A 2 hour race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-03-31T20:00:00Z",
      |    "endAt": "2012-03-31T22:00:00Z",
      |    "rules": []
      |  },
      |  {
      |    "id": "Event #3",
      |    "description": "A 2 hour hardcore race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-04-01T09:00:00Z",
      |    "endAt": "2012-04-01T11:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Event #4",
      |    "description": "A 2 hour hardcore race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-04-02T01:00:00Z",
      |    "endAt": "2012-04-02T03:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Apr14 HC Ladder Rush",
      |    "description": "A 3 hour ladder rush with prizes. See the forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-04-14T22:00:00Z",
      |    "endAt": "2012-04-15T01:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Cut-throat1",
      |    "description": "A private league for testing cut-throat mode.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-04-19T02:41:00Z",
      |    "endAt": "2012-04-19T02:51:00Z",
      |    "rules": [
      |      {
      |        "id": 2,
      |        "name": "Private",
      |        "description": "League requires a password to join."
      |      },
      |      {
      |        "id": 6,
      |        "name": "Drop equipped items on death",
      |        "description": "Items are dropped on death."
      |      },
      |      {
      |        "id": 7,
      |        "name": "Instance invasion",
      |        "description": "Allows you to select other people's instances in the instance manager."
      |      },
      |      {
      |        "id": 8,
      |        "name": "Harsh death experience penalty",
      |        "description": "Increases the death experience penalty by 30% on all difficulty levels."
      |      },
      |      {
      |        "id": 10,
      |        "name": "Hostile by default",
      |        "description": "Non-partymembers are hostile by default when you are not partied."
      |      },
      |      {
      |        "id": 11,
      |        "name": "Death penalty awarded to slayer",
      |        "description": "When killing a player, their death penalty is awarded to the player doing the killing."
      |      },
      |      {
      |        "id": 12,
      |        "name": "Increased player caps",
      |        "description": "Doubles player capacity in non-town instances. Does not increase the party size."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Cut-throat2",
      |    "description": "A private league for testing cut-throat mode.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-04-19T02:52:00Z",
      |    "endAt": "2012-04-19T04:05:00Z",
      |    "rules": [
      |      {
      |        "id": 2,
      |        "name": "Private",
      |        "description": "League requires a password to join."
      |      },
      |      {
      |        "id": 6,
      |        "name": "Drop equipped items on death",
      |        "description": "Items are dropped on death."
      |      },
      |      {
      |        "id": 7,
      |        "name": "Instance invasion",
      |        "description": "Allows you to select other people's instances in the instance manager."
      |      },
      |      {
      |        "id": 8,
      |        "name": "Harsh death experience penalty",
      |        "description": "Increases the death experience penalty by 30% on all difficulty levels."
      |      },
      |      {
      |        "id": 10,
      |        "name": "Hostile by default",
      |        "description": "Non-partymembers are hostile by default when you are not partied."
      |      },
      |      {
      |        "id": 11,
      |        "name": "Death penalty awarded to slayer",
      |        "description": "When killing a player, their death penalty is awarded to the player doing the killing."
      |      },
      |      {
      |        "id": 12,
      |        "name": "Increased player caps",
      |        "description": "Doubles player capacity in non-town instances. Does not increase the party size."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Cut-throat3",
      |    "description": "A private league for testing cut-throat mode.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-04-21T03:30:00Z",
      |    "endAt": "2012-04-21T05:00:00Z",
      |    "rules": [
      |      {
      |        "id": 2,
      |        "name": "Private",
      |        "description": "League requires a password to join."
      |      },
      |      {
      |        "id": 6,
      |        "name": "Drop equipped items on death",
      |        "description": "Items are dropped on death."
      |      },
      |      {
      |        "id": 7,
      |        "name": "Instance invasion",
      |        "description": "Allows you to select other people's instances in the instance manager."
      |      },
      |      {
      |        "id": 8,
      |        "name": "Harsh death experience penalty",
      |        "description": "Increases the death experience penalty by 30% on all difficulty levels."
      |      },
      |      {
      |        "id": 10,
      |        "name": "Hostile by default",
      |        "description": "Non-partymembers are hostile by default when you are not partied."
      |      },
      |      {
      |        "id": 11,
      |        "name": "Death penalty awarded to slayer",
      |        "description": "When killing a player, their death penalty is awarded to the player doing the killing."
      |      },
      |      {
      |        "id": 12,
      |        "name": "Increased player caps",
      |        "description": "Doubles player capacity in non-town instances. Does not increase the party size."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Cut-throat",
      |    "description": "A three hour cut-throat league. It's a bloodbath!",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-04-21T22:00:00Z",
      |    "endAt": "2012-04-22T01:00:00Z",
      |    "rules": [
      |      {
      |        "id": 6,
      |        "name": "Drop equipped items on death",
      |        "description": "Items are dropped on death."
      |      },
      |      {
      |        "id": 7,
      |        "name": "Instance invasion",
      |        "description": "Allows you to select other people's instances in the instance manager."
      |      },
      |      {
      |        "id": 8,
      |        "name": "Harsh death experience penalty",
      |        "description": "Increases the death experience penalty by 30% on all difficulty levels."
      |      },
      |      {
      |        "id": 10,
      |        "name": "Hostile by default",
      |        "description": "Non-partymembers are hostile by default when you are not partied."
      |      },
      |      {
      |        "id": 11,
      |        "name": "Death penalty awarded to slayer",
      |        "description": "When killing a player, their death penalty is awarded to the player doing the killing."
      |      },
      |      {
      |        "id": 12,
      |        "name": "Increased player caps",
      |        "description": "Doubles player capacity in non-town instances. Does not increase the party size."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "90m HC Cut-throat",
      |    "description": "A 90 minute hardcore cut-throat league. It's a bloodbath!",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-04-28T22:00:00Z",
      |    "endAt": "2012-04-28T23:30:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      },
      |      {
      |        "id": 6,
      |        "name": "Drop equipped items on death",
      |        "description": "Items are dropped on death."
      |      },
      |      {
      |        "id": 7,
      |        "name": "Instance invasion",
      |        "description": "Allows you to select other people's instances in the instance manager."
      |      },
      |      {
      |        "id": 8,
      |        "name": "Harsh death experience penalty",
      |        "description": "Increases the death experience penalty by 30% on all difficulty levels."
      |      },
      |      {
      |        "id": 10,
      |        "name": "Hostile by default",
      |        "description": "Non-partymembers are hostile by default when you are not partied."
      |      },
      |      {
      |        "id": 11,
      |        "name": "Death penalty awarded to slayer",
      |        "description": "When killing a player, their death penalty is awarded to the player doing the killing."
      |      },
      |      {
      |        "id": 12,
      |        "name": "Increased player caps",
      |        "description": "Doubles player capacity in non-town instances. Does not increase the party size."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Migrating to Legacy",
      |    "description": "The default game mode.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": null,
      |    "endAt": null,
      |    "rules": []
      |  },
      |  {
      |    "id": "Migrating to HC Legacy",
      |    "description": "A character killed in the Hardcore league is moved to the Default league.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": null,
      |    "endAt": null,
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Event 1",
      |    "description": "A 2 hour race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-05-12T04:00:00Z",
      |    "endAt": "2012-05-12T06:00:00Z",
      |    "rules": []
      |  },
      |  {
      |    "id": "Event 2",
      |    "description": "A 2 hour race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-05-12T20:00:00Z",
      |    "endAt": "2012-05-12T22:00:00Z",
      |    "rules": []
      |  },
      |  {
      |    "id": "Event 3",
      |    "description": "A 2 hour HC race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-05-13T09:00:00Z",
      |    "endAt": "2012-05-13T11:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Event 4",
      |    "description": "A 2 hour HC race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-05-14T01:00:00Z",
      |    "endAt": "2012-05-14T03:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "June 17 3h HC Race",
      |    "description": "A 3 hour HC race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-06-16T21:00:00Z",
      |    "endAt": "2012-06-17T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "June 24 3h HC Race",
      |    "description": "A 3 hour HC race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-06-23T21:00:00Z",
      |    "endAt": "2012-06-24T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "July 1 3h HC Race",
      |    "description": "A 3 hour HC race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-06-30T21:00:00Z",
      |    "endAt": "2012-07-01T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "temp",
      |    "description": "A private league for www.twitch.tv/riptentv",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-07-02T13:30:00Z",
      |    "endAt": "2012-07-02T17:30:00Z",
      |    "rules": [
      |      {
      |        "id": 2,
      |        "name": "Private",
      |        "description": "League requires a password to join."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "RipTenTV Race 1",
      |    "description": "A private league for www.twitch.tv/riptentv",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-07-03T01:30:00Z",
      |    "endAt": "2012-07-03T05:30:00Z",
      |    "rules": [
      |      {
      |        "id": 2,
      |        "name": "Private",
      |        "description": "League requires a password to join."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "July 8 3h HC Race",
      |    "description": "A 3 hour HC race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-07-07T21:00:00Z",
      |    "endAt": "2012-07-08T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "July 15 3h HC Race",
      |    "description": "A 3 hour HC race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-07-14T21:00:00Z",
      |    "endAt": "2012-07-15T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "July 22 3h HC Race",
      |    "description": "A 3 hour HC race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-07-21T21:00:00Z",
      |    "endAt": "2012-07-22T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "2 Week HC Race",
      |    "description": "A two week hardcore race with prizes. See the Beta Status forum for information!",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-07-25T00:00:00Z",
      |    "endAt": "2012-08-08T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Weekend Event #1",
      |    "description": "A 2 hour race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-07-28T04:00:00Z",
      |    "endAt": "2012-07-28T06:00:00Z",
      |    "rules": []
      |  },
      |  {
      |    "id": "Weekend Event #2",
      |    "description": "A 2 hour race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-07-28T20:00:00Z",
      |    "endAt": "2012-07-28T22:00:00Z",
      |    "rules": []
      |  },
      |  {
      |    "id": "Weekend Event #3",
      |    "description": "A 2 hour race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-07-29T09:00:00Z",
      |    "endAt": "2012-07-29T11:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Weekend Event #4",
      |    "description": "A 2 hour race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-07-30T01:00:00Z",
      |    "endAt": "2012-07-30T03:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "One Hour Cut-throat1",
      |    "description": "A 60 minute cut-throat league. It's a bloodbath!",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-08-04T02:00:00Z",
      |    "endAt": "2012-08-04T03:00:00Z",
      |    "rules": [
      |      {
      |        "id": 6,
      |        "name": "Drop equipped items on death",
      |        "description": "Items are dropped on death."
      |      },
      |      {
      |        "id": 7,
      |        "name": "Instance invasion",
      |        "description": "Allows you to select other people's instances in the instance manager."
      |      },
      |      {
      |        "id": 8,
      |        "name": "Harsh death experience penalty",
      |        "description": "Increases the death experience penalty by 30% on all difficulty levels."
      |      },
      |      {
      |        "id": 10,
      |        "name": "Hostile by default",
      |        "description": "Non-partymembers are hostile by default when you are not partied."
      |      },
      |      {
      |        "id": 11,
      |        "name": "Death penalty awarded to slayer",
      |        "description": "When killing a player, their death penalty is awarded to the player doing the killing."
      |      },
      |      {
      |        "id": 12,
      |        "name": "Increased player caps",
      |        "description": "Doubles player capacity in non-town instances. Does not increase the party size."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Aug 5 3h HC Race",
      |    "description": "A 3 hour HC race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-08-04T21:00:00Z",
      |    "endAt": "2012-08-05T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "One Hour Cut-throat2",
      |    "description": "A 60 minute cut-throat league. It's a bloodbath!",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-08-11T02:00:00Z",
      |    "endAt": "2012-08-11T03:00:00Z",
      |    "rules": [
      |      {
      |        "id": 6,
      |        "name": "Drop equipped items on death",
      |        "description": "Items are dropped on death."
      |      },
      |      {
      |        "id": 7,
      |        "name": "Instance invasion",
      |        "description": "Allows you to select other people's instances in the instance manager."
      |      },
      |      {
      |        "id": 8,
      |        "name": "Harsh death experience penalty",
      |        "description": "Increases the death experience penalty by 30% on all difficulty levels."
      |      },
      |      {
      |        "id": 10,
      |        "name": "Hostile by default",
      |        "description": "Non-partymembers are hostile by default when you are not partied."
      |      },
      |      {
      |        "id": 11,
      |        "name": "Death penalty awarded to slayer",
      |        "description": "When killing a player, their death penalty is awarded to the player doing the killing."
      |      },
      |      {
      |        "id": 12,
      |        "name": "Increased player caps",
      |        "description": "Doubles player capacity in non-town instances. Does not increase the party size."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "One Hour Cut-throat3",
      |    "description": "A 60 minute cut-throat league. It's a bloodbath!",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-08-11T00:10:00Z",
      |    "endAt": "2012-08-11T01:10:00Z",
      |    "rules": [
      |      {
      |        "id": 6,
      |        "name": "Drop equipped items on death",
      |        "description": "Items are dropped on death."
      |      },
      |      {
      |        "id": 7,
      |        "name": "Instance invasion",
      |        "description": "Allows you to select other people's instances in the instance manager."
      |      },
      |      {
      |        "id": 8,
      |        "name": "Harsh death experience penalty",
      |        "description": "Increases the death experience penalty by 30% on all difficulty levels."
      |      },
      |      {
      |        "id": 10,
      |        "name": "Hostile by default",
      |        "description": "Non-partymembers are hostile by default when you are not partied."
      |      },
      |      {
      |        "id": 11,
      |        "name": "Death penalty awarded to slayer",
      |        "description": "When killing a player, their death penalty is awarded to the player doing the killing."
      |      },
      |      {
      |        "id": 12,
      |        "name": "Increased player caps",
      |        "description": "Doubles player capacity in non-town instances. Does not increase the party size."
      |      }
      |    ]
      |  },
      |  {
      |    "id": "Aug 12 3h HC Race",
      |    "description": "A 3 hour HC race event with prizes. See the Beta Status forum for details.",
      |    "registerAt": null,
      |    "event": false,
      |    "url": null,
      |    "startAt": "2012-08-11T21:00:00Z",
      |    "endAt": "2012-08-12T00:00:00Z",
      |    "rules": [
      |      {
      |        "id": 4,
      |        "name": "Hardcore",
      |        "description": "A character killed in Hardcore is moved to its parent league."
      |      }
      |    ]
      |  }
      |]
    """.stripMargin


}
