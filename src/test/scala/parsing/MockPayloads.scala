package parsing

object MockPayloads {

  val stashes =
    """
      |{
      |  "next_change_id": "2300-4354-3306-4374-1278",
      |  "stashes": [
      |    {
      |      "accountName": "Nightlines",
      |      "lastCharacterName": "ProbablyPizzaSticks",
      |      "id": "a9a42a5dbda657f71b077ecd0692acce8d1d29c7dff3437e5ed8708f6cb8838f",
      |      "stash": "LEVELING UNIQUES",
      |      "stashType": "PremiumStash",
      |      "items": [],
      |      "public": false
      |    },
      |    {
      |      "accountName": "Jephire",
      |      "lastCharacterName": "",
      |      "id": "3c8f1dc99dabab14f888755f133dfb532dee09edb2058dd7138d4409c6923f72",
      |      "stash": "$",
      |      "stashType": "PremiumStash",
      |      "items": [],
      |      "public": false
      |    },
      |    {
      |      "accountName": "5a4oK",
      |      "lastCharacterName": "temniypoputchik___",
      |      "id": "6e6c9fccde21d76d8d5a55dea31a45e34e426f10fb5eaebe0d67d8c7cdfa5ccd",
      |      "stash": "Orbs",
      |      "stashType": "PremiumStash",
      |      "items": [],
      |      "public": false
      |    },
      |    {
      |      "accountName": "5a4oK",
      |      "lastCharacterName": "temniypoputchik___",
      |      "id": "6e744b0f76179835e1f681ce81c513ea190cb021b34eaacafe4c3d4f6990395f",
      |      "stash": "What i need",
      |      "stashType": "PremiumStash",
      |      "items": [
      |        {
      |          "verified": false,
      |          "w": 2,
      |          "h": 4,
      |          "ilvl": 71,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Weapons/TwoHandWeapons/Bows/SarkhamsReach.png?scale=1&w=2&h=4&v=f333c2e4005ee20a84270731baa5fa6a3",
      |          "league": "Hardcore",
      |          "id": "176b5e6f7af0a5bb4b48d7fdafa47501a179f4ea095815a58c82c4b5244b3cdb",
      |          "sockets": [
      |            {
      |              "group": 0,
      |              "attr": "D"
      |            }
      |          ],
      |          "name": "<<set:MS>><<set:M>><<set:S>>Roth's Reach",
      |          "typeLine": "Recurve Bow",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "note": "~price 10 exa",
      |          "properties": [
      |            {
      |              "name": "Bow",
      |              "values": [],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Quality",
      |              "values": [
      |                [
      |                  "+17%",
      |                  1
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 6
      |            },
      |            {
      |              "name": "Physical Damage",
      |              "values": [
      |                [
      |                  "20-63",
      |                  1
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 9
      |            },
      |            {
      |              "name": "Critical Strike Chance",
      |              "values": [
      |                [
      |                  "6.50%",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 12
      |            },
      |            {
      |              "name": "Attacks per Second",
      |              "values": [
      |                [
      |                  "1.31",
      |                  1
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 13
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "18",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Dex",
      |              "values": [
      |                [
      |                  "65",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 1
      |            }
      |          ],
      |          "explicitMods": [
      |            "68% increased Physical Damage",
      |            "34% increased Elemental Damage with Weapons",
      |            "5% increased Attack Speed",
      |            "Skills Chain +1 times",
      |            "30% increased Projectile Speed"
      |          ],
      |          "flavourText": [
      |            "\"Exiled to the sea; what a joke. \r",
      |            "I'm more free than I've ever been.\"\r",
      |            "- Captain Weylam \"Rot-tooth\" Roth of the Black Crest"
      |          ],
      |          "frameType": 3,
      |          "x": 10,
      |          "y": 0,
      |          "inventoryId": "Stash1",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 1,
      |          "ilvl": 0,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Gems/LeapSlam.png?scale=1&w=1&h=1&v=73d0b5f9f1c52f0e0e87f74a80a549ab3",
      |          "support": false,
      |          "league": "Hardcore",
      |          "id": "8d84024bd2f99bd467b671e6915bc999f6e26f512c7f7034f54ff182781198e6",
      |          "sockets": [],
      |          "name": "",
      |          "typeLine": "Leap Slam",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Attack, AoE, Movement, Melee",
      |              "values": [],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "1",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 5
      |            },
      |            {
      |              "name": "Mana Cost",
      |              "values": [
      |                [
      |                  "15",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "additionalProperties": [
      |            {
      |              "name": "Experience",
      |              "values": [
      |                [
      |                  "9569/9569",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 2,
      |              "progress": 1
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "10",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Str",
      |              "values": [
      |                [
      |                  "29",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 1
      |            }
      |          ],
      |          "nextLevelRequirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "13",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Str",
      |              "values": [
      |                [
      |                  "35",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 1
      |            }
      |          ],
      |          "secDescrText": "Jump into the air, damaging enemies (and knocking back some) with your main hand where you land. Enemies you would land on are pushed out of the way. Requires an axe, mace, sword or staff.",
      |          "explicitMods": [
      |            "20% chance to Knock Enemies Back on hit"
      |          ],
      |          "descrText": "Place into an item socket of the right colour to gain this skill. Right click to remove from a socket.",
      |          "frameType": 4,
      |          "x": 0,
      |          "y": 1,
      |          "inventoryId": "Stash2",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 1,
      |          "ilvl": 1,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Jewels/HighQuestRewardRed.png?scale=1&w=1&h=1&v=fcfea32513c2b1566a61fddfd1c341c93",
      |          "league": "Hardcore",
      |          "id": "d9503c22d6a753bed25ee06b63e8b17ad5f898cc7266a6eccebe6f993ee8944f",
      |          "sockets": [],
      |          "name": "<<set:MS>><<set:M>><<set:S>>Conqueror's Efficiency",
      |          "typeLine": "Crimson Jewel",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Limited to",
      |              "values": [
      |                [
      |                  "1",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "explicitMods": [
      |            "3% reduced Mana Cost of Skills",
      |            "4% increased Skill Effect Duration",
      |            "2% reduced Mana Reserved"
      |          ],
      |          "descrText": "Place into an allocated Jewel Socket on the Passive Skill Tree. Right click to remove from the Socket.",
      |          "flavourText": [
      |            "The stone may yet bleed."
      |          ],
      |          "frameType": 3,
      |          "x": 11,
      |          "y": 5,
      |          "inventoryId": "Stash3",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 1,
      |          "ilvl": 73,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Amulets/TurquoiseAmulet.png?scale=1&w=1&h=1&v=484a8eac4316c65308deea4efcfbb6213",
      |          "league": "Hardcore",
      |          "id": "358da932979a1121115fd923e0d57fd9fb7f179ddca77a7abfe6e1d767034924",
      |          "sockets": [],
      |          "name": "<<set:MS>><<set:M>><<set:S>>Soul Beads",
      |          "typeLine": "Turquoise Amulet",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "57",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "implicitMods": [
      |            "+18 to Dexterity and Intelligence"
      |          ],
      |          "explicitMods": [
      |            "11% increased Spell Damage",
      |            "Adds 18 to 31 Fire Damage to Attacks",
      |            "37% increased Global Critical Strike Chance",
      |            "+25 to maximum Mana",
      |            "+27% to Fire Resistance",
      |            "+23% to Cold Resistance"
      |          ],
      |          "frameType": 2,
      |          "x": 0,
      |          "y": 0,
      |          "inventoryId": "Stash4",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 1,
      |          "ilvl": 0,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Gems/Support/IncreasedDuration.png?scale=1&w=1&h=1&v=14b3a91933f0b921d1b573358e31f7683",
      |          "support": true,
      |          "league": "Hardcore",
      |          "id": "2ce90c7a129f83de3406769e8b9e09763be5e5ad4311bf475cf5d4375831f705",
      |          "sockets": [],
      |          "name": "",
      |          "typeLine": "Increased Duration Support",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Support, Duration",
      |              "values": [],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "1",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 5
      |            },
      |            {
      |              "name": "Mana Multiplier",
      |              "values": [
      |                [
      |                  "140%",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "additionalProperties": [
      |            {
      |              "name": "Experience",
      |              "values": [
      |                [
      |                  "1/285815",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 2,
      |              "progress": 0.00000349876677319
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "31",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Str",
      |              "values": [
      |                [
      |                  "52",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 1
      |            }
      |          ],
      |          "explicitMods": [
      |            "45% increased Skill Effect Duration"
      |          ],
      |          "descrText": "This is a Support Gem. It does not grant a bonus to your character, but to skills in sockets connected to it. Place into an item socket connected to a socket containing the Active Skill Gem you wish to augment. Right click to remove from a socket.",
      |          "frameType": 4,
      |          "x": 0,
      |          "y": 2,
      |          "inventoryId": "Stash5",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 2,
      |          "ilvl": 71,
      |          "icon": "http://web.poecdn.com/gen/image/YTo1OntzOjEwOiJsZWFn/dWVOYW1lIjtzOjg6Ikhh/cmRjb3JlIjtzOjk6ImFj/Y291bnRJZCI7TzoxODoi/R3JpbmRiXERhdGFiYXNl/XElkIjoxOntzOjI6Imlk/IjtpOjA7fWk6MjthOjM6/e3M6MToiZiI7czozMzoi/QXJ0LzJESXRlbXMvRmxh/c2tzL2V2YXNpb25mbGFz/azAxIjtzOjI6InNwIjtk/OjAuNjA4NTE5MjY5Nzc2/ODc2MzE0ODE0NzI4NjMw/MTUzNjk1MTIxNDA3NTA4/ODUwMDk3NjU2MjU7czo1/OiJsZXZlbCI7aTowO31p/OjE7aTo0O2k6MDtpOjk7/fQ,,/bbc8755018/Item.png",
      |          "league": "Hardcore",
      |          "id": "bcd6e8fa61888422a1faed414577030569395da4290012e1bbe54b017071011b",
      |          "sockets": [],
      |          "name": "",
      |          "typeLine": "Jade Flask",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Lasts %0 Seconds",
      |              "values": [
      |                [
      |                  "4.00",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            },
      |            {
      |              "name": "Consumes %0 of %1 Charges on use",
      |              "values": [
      |                [
      |                  "30",
      |                  0
      |                ],
      |                [
      |                  "60",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            },
      |            {
      |              "name": "Currently has %0 Charges",
      |              "values": [
      |                [
      |                  "0",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "27",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "utilityMods": [
      |            "+3000 to Evasion Rating"
      |          ],
      |          "descrText": "Right click to drink. Can only hold charges while in belt. Refills as you kill monsters.",
      |          "frameType": 0,
      |          "x": 10,
      |          "y": 8,
      |          "inventoryId": "Stash6",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 2,
      |          "ilvl": 62,
      |          "icon": "http://web.poecdn.com/gen/image/YTo1OntzOjEwOiJsZWFn/dWVOYW1lIjtzOjg6Ikhh/cmRjb3JlIjtzOjk6ImFj/Y291bnRJZCI7TzoxODoi/R3JpbmRiXERhdGFiYXNl/XElkIjoxOntzOjI6Imlk/IjtpOjA7fWk6MjthOjM6/e3M6MToiZiI7czozMDoi/QXJ0LzJESXRlbXMvRmxh/c2tzL2xpZmVmbGFzazEw/IjtzOjI6InNwIjtkOjAu/NjA4NTE5MjY5Nzc2ODc2/MzE0ODE0NzI4NjMwMTUz/Njk1MTIxNDA3NTA4ODUw/MDk3NjU2MjU7czo1OiJs/ZXZlbCI7aTowO31pOjE7/aTo0O2k6MDtpOjk7fQ,,/6e582bb2ce/Item.png",
      |          "league": "Hardcore",
      |          "id": "5e968f419af74b6c673927fd0f083ab3599573d2879d1f6e9c27085a761ea9fa",
      |          "sockets": [],
      |          "name": "",
      |          "typeLine": "<<set:MS>><<set:M>><<set:S>>Cautious Divine Life Flask of Warding",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Quality",
      |              "values": [
      |                [
      |                  "+20%",
      |                  1
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 6
      |            },
      |            {
      |              "name": "Recovers %0 Life over %1 Seconds",
      |              "values": [
      |                [
      |                  "2880",
      |                  1
      |                ],
      |                [
      |                  "7.00",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            },
      |            {
      |              "name": "Consumes %0 of %1 Charges on use",
      |              "values": [
      |                [
      |                  "15",
      |                  0
      |                ],
      |                [
      |                  "45",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            },
      |            {
      |              "name": "Currently has %0 Charges",
      |              "values": [
      |                [
      |                  "0",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "60",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "explicitMods": [
      |            "100% increased Recovery when on Low Life",
      |            "Immune to Curses during Flask effect\nRemoves Curses on use"
      |          ],
      |          "descrText": "Right click to drink. Can only hold charges while in belt. Refills as you kill monsters.",
      |          "frameType": 1,
      |          "x": 11,
      |          "y": 6,
      |          "inventoryId": "Stash7",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 1,
      |          "ilvl": 72,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Amulets/TurquoiseAmulet.png?scale=1&w=1&h=1&v=484a8eac4316c65308deea4efcfbb6213",
      |          "league": "Hardcore",
      |          "id": "ec668472eadc44c1cbca519d5f1b085cc68adda7aaa1440511d6724b699d3506",
      |          "sockets": [],
      |          "name": "<<set:MS>><<set:M>><<set:S>>Pandemonium Beads",
      |          "typeLine": "Turquoise Amulet",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "57",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "implicitMods": [
      |            "+18 to Dexterity and Intelligence"
      |          ],
      |          "explicitMods": [
      |            "20% increased Spell Damage",
      |            "+11 to all Attributes",
      |            "+32 to maximum Life",
      |            "+43% to Cold Resistance"
      |          ],
      |          "frameType": 2,
      |          "x": 0,
      |          "y": 7,
      |          "inventoryId": "Stash8",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 1,
      |          "ilvl": 0,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Gems/ImmortalCall.png?scale=1&w=1&h=1&v=3843ced383e5dca18e076e57e9f678193",
      |          "support": false,
      |          "league": "Hardcore",
      |          "id": "c4a85d530351912d143119656fb542bf9408457f2329bb8dfeb32a00f49866bf",
      |          "sockets": [],
      |          "name": "",
      |          "typeLine": "Immortal Call",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Spell, Duration",
      |              "values": [],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "1",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 5
      |            },
      |            {
      |              "name": "Mana Cost",
      |              "values": [
      |                [
      |                  "21",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Cooldown Time",
      |              "values": [
      |                [
      |                  "3.00 sec",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Cast Time",
      |              "values": [
      |                [
      |                  "0.85 sec",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "additionalProperties": [
      |            {
      |              "name": "Experience",
      |              "values": [
      |                [
      |                  "1/252595",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 2,
      |              "progress": 0.00000395890674554
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "34",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Str",
      |              "values": [
      |                [
      |                  "79",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 1
      |            }
      |          ],
      |          "secDescrText": "Discharges Endurance Charges, making the character invulnerable to physical damage for a short time, proportional to how many endurance charges were expended.",
      |          "explicitMods": [
      |            "Base duration is 0.40 seconds",
      |            "100% increased Buff Duration per Endurance Charge"
      |          ],
      |          "descrText": "Place into an item socket of the right colour to gain this skill. Right click to remove from a socket.",
      |          "frameType": 4,
      |          "x": 0,
      |          "y": 6,
      |          "inventoryId": "Stash9",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 1,
      |          "ilvl": 0,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Gems/HeraldofIce.png?scale=1&w=1&h=1&v=098e32bf010edc365f1ec453f3477bc73",
      |          "support": false,
      |          "league": "Hardcore",
      |          "id": "3431d653f0728e1c58db7a2f1cfee5191b5534bb8883b752e487e1cd4949a9a7",
      |          "sockets": [],
      |          "name": "",
      |          "typeLine": "Herald of Ice",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Cast, AoE, Cold",
      |              "values": [],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "1",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 5
      |            },
      |            {
      |              "name": "Mana Reserved",
      |              "values": [
      |                [
      |                  "25%",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Cooldown Time",
      |              "values": [
      |                [
      |                  "1.00 sec",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Cast Time",
      |              "values": [
      |                [
      |                  "1.00 sec",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Damage Effectiveness",
      |              "values": [
      |                [
      |                  "80%",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "additionalProperties": [
      |            {
      |              "name": "Experience",
      |              "values": [
      |                [
      |                  "1/49725",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 2,
      |              "progress": 0.0000201106086024
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "16",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Dex",
      |              "values": [
      |                [
      |                  "26",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 1
      |            },
      |            {
      |              "name": "Int",
      |              "values": [
      |                [
      |                  "18",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 1
      |            }
      |          ],
      |          "secDescrText": "Channel ice through your hands, adding cold damage to spells and attacks. If you shatter an enemy, they explode and deal AoE cold damage to enemies near them.",
      |          "explicitMods": [
      |            "Deals 18 to 26 Cold Damage",
      |            "Damage cannot be Reflected",
      |            "Adds 4 to 5 Cold Damage to Attacks",
      |            "Adds 4 to 5 Cold Damage to Spells"
      |          ],
      |          "descrText": "Place into an item socket of the right colour to gain this skill. Right click to remove from a socket.",
      |          "frameType": 4,
      |          "x": 0,
      |          "y": 5,
      |          "inventoryId": "Stash10",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 1,
      |          "ilvl": 1,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Jewels/MidQuestRewardRed.png?scale=1&w=1&h=1&v=aa8cbeb565cc7d9ea0c852f2889ab9d23",
      |          "league": "Hardcore",
      |          "id": "e768eb8f423f0ffc5cbf2e1e687f3e9f4289ff48565f2876b4a03033c3047c90",
      |          "sockets": [],
      |          "name": "<<set:MS>><<set:M>><<set:S>>Warlord's Reach",
      |          "typeLine": "Crimson Jewel",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Limited to",
      |              "values": [
      |                [
      |                  "1",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "explicitMods": [
      |            "8% increased Attack Damage",
      |            "+1 to Melee Weapon and Unarmed range"
      |          ],
      |          "descrText": "Place into an allocated Jewel Socket on the Passive Skill Tree. Right click to remove from the Socket.",
      |          "flavourText": [
      |            "A steady hand can hold back an army."
      |          ],
      |          "frameType": 3,
      |          "x": 11,
      |          "y": 4,
      |          "inventoryId": "Stash11",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 1,
      |          "ilvl": 0,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Gems/Support/LifeLeech.png?scale=1&w=1&h=1&v=a286b7cb68bee2319a14a80c1e4bcf9c3",
      |          "support": true,
      |          "league": "Hardcore",
      |          "id": "27134d26d7bd46362435339f2be02f76b21ac4018cc72e6c5e9e4c83436df071",
      |          "sockets": [],
      |          "name": "",
      |          "typeLine": "Life Leech Support",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Support",
      |              "values": [],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "1",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 5
      |            },
      |            {
      |              "name": "Mana Multiplier",
      |              "values": [
      |                [
      |                  "130%",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "additionalProperties": [
      |            {
      |              "name": "Experience",
      |              "values": [
      |                [
      |                  "1/285815",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 2,
      |              "progress": 0.00000349876677319
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "31",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Str",
      |              "values": [
      |                [
      |                  "52",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 1
      |            }
      |          ],
      |          "explicitMods": [
      |            "2% of Damage Leeched as Life"
      |          ],
      |          "descrText": "This is a Support Gem. It does not grant a bonus to your character, but to skills in sockets connected to it. Place into an item socket connected to a socket containing the Active Skill Gem you wish to augment. Right click to remove from a socket.",
      |          "frameType": 4,
      |          "x": 0,
      |          "y": 3,
      |          "inventoryId": "Stash12",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 1,
      |          "ilvl": 0,
      |          "icon": "http://web.poecdn.com/image/Art/2DItems/Gems/SiphonGem.png?scale=1&w=1&h=1&v=3c8bba854543b5f696b81cc6517dbcf73",
      |          "support": false,
      |          "league": "Hardcore",
      |          "id": "6261eb58d7cd12acc4dc938f353ca7ba12f37a3d2bf494c7dbef6e7b24e9b226",
      |          "sockets": [],
      |          "name": "",
      |          "typeLine": "Essence Drain",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Projectile, Spell, Duration, Chaos",
      |              "values": [],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "1",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0,
      |              "type": 5
      |            },
      |            {
      |              "name": "Mana Cost",
      |              "values": [
      |                [
      |                  "9",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Cast Time",
      |              "values": [
      |                [
      |                  "0.75 sec",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Critical Strike Chance",
      |              "values": [
      |                [
      |                  "5.00%",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Damage Effectiveness",
      |              "values": [
      |                [
      |                  "60%",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "additionalProperties": [
      |            {
      |              "name": "Experience",
      |              "values": [
      |                [
      |                  "1/15249",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 2,
      |              "progress": 0.0000655780677334
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "12",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            },
      |            {
      |              "name": "Dex",
      |              "values": [
      |                [
      |                  "14",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 1
      |            },
      |            {
      |              "name": "Int",
      |              "values": [
      |                [
      |                  "21",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 1
      |            }
      |          ],
      |          "secDescrText": "Fires a projectile that applies a damage over time debuff when it hits. You are healed for a portion of the debuff damage. The debuff is spread by Contagion.",
      |          "explicitMods": [
      |            "Deals 6 to 9 Chaos Damage",
      |            "Deals 21.5 Base Chaos Damage per second",
      |            "Base duration is 3.80 seconds",
      |            "Modifiers to Spell Damage apply to this skill's Damage Over Time",
      |            "Regenerate 0.50% of Debuff Damage as Life"
      |          ],
      |          "descrText": "Place into an item socket of the right colour to gain this skill. Right click to remove from a socket.",
      |          "frameType": 4,
      |          "x": 0,
      |          "y": 4,
      |          "inventoryId": "Stash13",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 2,
      |          "ilvl": 68,
      |          "icon": "http://web.poecdn.com/gen/image/YTo1OntzOjEwOiJsZWFn/dWVOYW1lIjtzOjg6Ikhh/cmRjb3JlIjtzOjk6ImFj/Y291bnRJZCI7TzoxODoi/R3JpbmRiXERhdGFiYXNl/XElkIjoxOntzOjI6Imlk/IjtpOjA7fWk6MjthOjM6/e3M6MToiZiI7czozMzoi/QXJ0LzJESXRlbXMvRmxh/c2tzL2V2YXNpb25mbGFz/azAxIjtzOjI6InNwIjtk/OjAuNjA4NTE5MjY5Nzc2/ODc2MzE0ODE0NzI4NjMw/MTUzNjk1MTIxNDA3NTA4/ODUwMDk3NjU2MjU7czo1/OiJsZXZlbCI7aTowO31p/OjE7aTo0O2k6MDtpOjk7/fQ,,/bbc8755018/Item.png",
      |          "league": "Hardcore",
      |          "id": "dac306afc3a91e423e870c23aed8d944f38d29badd6c756645632a4e317bcbda",
      |          "sockets": [],
      |          "name": "",
      |          "typeLine": "Jade Flask",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Lasts %0 Seconds",
      |              "values": [
      |                [
      |                  "4.00",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            },
      |            {
      |              "name": "Consumes %0 of %1 Charges on use",
      |              "values": [
      |                [
      |                  "30",
      |                  0
      |                ],
      |                [
      |                  "60",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            },
      |            {
      |              "name": "Currently has %0 Charges",
      |              "values": [
      |                [
      |                  "0",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "27",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "utilityMods": [
      |            "+3000 to Evasion Rating"
      |          ],
      |          "descrText": "Right click to drink. Can only hold charges while in belt. Refills as you kill monsters.",
      |          "frameType": 0,
      |          "x": 11,
      |          "y": 8,
      |          "inventoryId": "Stash14",
      |          "socketedItems": []
      |        },
      |        {
      |          "verified": false,
      |          "w": 1,
      |          "h": 2,
      |          "ilvl": 52,
      |          "icon": "http://web.poecdn.com/gen/image/YTo1OntzOjEwOiJsZWFn/dWVOYW1lIjtzOjg6Ikhh/cmRjb3JlIjtzOjk6ImFj/Y291bnRJZCI7TzoxODoi/R3JpbmRiXERhdGFiYXNl/XElkIjoxOntzOjI6Imlk/IjtpOjA7fWk6MjthOjM6/e3M6MToiZiI7czoyNToi/QXJ0LzJESXRlbXMvRmxh/c2tzL3NwcmludCI7czoy/OiJzcCI7ZDowLjYwODUx/OTI2OTc3Njg3NjMxNDgx/NDcyODYzMDE1MzY5NTEy/MTQwNzUwODg1MDA5NzY1/NjI1O3M6NToibGV2ZWwi/O2k6MDt9aToxO2k6NDtp/OjA7aTo5O30,/8f6fc96c4e/Item.png",
      |          "league": "Hardcore",
      |          "id": "8bfb9fb7925e3a40b89bf52d7edd1257afe19db1b8527a13c80e00b2d338b99c",
      |          "sockets": [],
      |          "name": "",
      |          "typeLine": "<<set:MS>><<set:M>><<set:S>>Surgeon's Quicksilver Flask of Adrenaline",
      |          "identified": true,
      |          "corrupted": false,
      |          "lockedToCharacter": false,
      |          "properties": [
      |            {
      |              "name": "Lasts %0 Seconds",
      |              "values": [
      |                [
      |                  "4.00",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            },
      |            {
      |              "name": "Consumes %0 of %1 Charges on use",
      |              "values": [
      |                [
      |                  "20",
      |                  0
      |                ],
      |                [
      |                  "50",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            },
      |            {
      |              "name": "Currently has %0 Charges",
      |              "values": [
      |                [
      |                  "0",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 3
      |            }
      |          ],
      |          "requirements": [
      |            {
      |              "name": "Level",
      |              "values": [
      |                [
      |                  "6",
      |                  0
      |                ]
      |              ],
      |              "displayMode": 0
      |            }
      |          ],
      |          "utilityMods": [
      |            "40% increased Movement Speed"
      |          ],
      |          "explicitMods": [
      |            "20% chance to gain a Flask Charge when you deal a Critical Strike",
      |            "24% increased Movement Speed during Flask effect"
      |          ],
      |          "descrText": "Right click to drink. Can only hold charges while in belt. Refills as you kill monsters.",
      |          "frameType": 1,
      |          "x": 11,
      |          "y": 10,
      |          "inventoryId": "Stash15",
      |          "socketedItems": []
      |        }
      |      ],
      |      "public": true
      |    }
      |  ]
      |}
    """.stripMargin

  val leagues =
    """
      |[
      |    {
      |        "id": "Medallion (MDS087b)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1710262",
      |        "startAt": "2016-08-10T04:00:00Z",
      |        "endAt": "2016-08-10T05:00:00Z"
      |    },
      |    {
      |        "id": "30 Min Endless Ledge (MDC001)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703722",
      |        "startAt": "2016-07-22T18:00:00Z",
      |        "endAt": "2016-07-22T18:30:00Z"
      |    },
      |    {
      |        "id": "48 Hr Flashback Solo (MDC101b)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703834",
      |        "startAt": "2016-08-13T01:10:00Z",
      |        "endAt": "2016-08-15T01:10:00Z"
      |    },
      |    {
      |        "id": "Mistress of Flame Kill (MDC002)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703723",
      |        "startAt": "2016-07-22T22:00:00Z",
      |        "endAt": "2016-07-22T23:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS003)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703724",
      |        "startAt": "2016-07-23T02:00:00Z",
      |        "endAt": "2016-07-23T03:00:00Z"
      |    },
      |    {
      |        "id": "Cutthroat (MDC004)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703725",
      |        "startAt": "2016-07-23T06:00:00Z",
      |        "endAt": "2016-07-23T10:00:00Z"
      |    },
      |    {
      |        "id": "Act 2 Solo (MDV005)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703726",
      |        "startAt": "2016-07-23T14:00:00Z",
      |        "endAt": "2016-07-23T14:45:00Z"
      |    },
      |    {
      |        "id": "OHAA Malachai Kill (MDC006)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703727",
      |        "startAt": "2016-07-23T18:00:00Z",
      |        "endAt": "2016-07-23T23:00:00Z"
      |    },
      |    {
      |        "id": "DC Gravicius Kill (MDC007)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703728",
      |        "startAt": "2016-07-24T02:00:00Z",
      |        "endAt": "2016-07-24T03:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS008)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703729",
      |        "startAt": "2016-07-24T06:00:00Z",
      |        "endAt": "2016-07-24T07:00:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC009A)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703730",
      |        "startAt": "2016-07-24T10:00:00Z",
      |        "endAt": "2016-07-24T10:12:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC009B)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703731",
      |        "startAt": "2016-07-24T10:20:00Z",
      |        "endAt": "2016-07-24T10:32:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC009C)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703732",
      |        "startAt": "2016-07-24T10:40:00Z",
      |        "endAt": "2016-07-24T10:52:00Z"
      |    },
      |    {
      |        "id": "Exiles Everywhere (MDC010)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703733",
      |        "startAt": "2016-07-24T17:00:00Z",
      |        "endAt": "2016-07-24T18:00:00Z"
      |    },
      |    {
      |        "id": "Brutus Kill (MDV011)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703734",
      |        "startAt": "2016-07-24T22:00:00Z",
      |        "endAt": "2016-07-24T23:00:00Z"
      |    },
      |    {
      |        "id": "1h BLAMT Party (MDC012)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703735",
      |        "startAt": "2016-07-25T02:00:00Z",
      |        "endAt": "2016-07-25T03:00:00Z"
      |    },
      |    {
      |        "id": "Mistress of Flame Kill (MDC013)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703736",
      |        "startAt": "2016-07-25T06:00:00Z",
      |        "endAt": "2016-07-25T07:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS014)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703737",
      |        "startAt": "2016-07-25T10:00:00Z",
      |        "endAt": "2016-07-25T11:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS015)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703738",
      |        "startAt": "2016-07-25T14:00:00Z",
      |        "endAt": "2016-07-25T15:00:00Z"
      |    },
      |    {
      |        "id": "One Hour Solo (MDV016)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703739",
      |        "startAt": "2016-07-25T18:00:00Z",
      |        "endAt": "2016-07-25T19:00:00Z"
      |    },
      |    {
      |        "id": "Act 2 Dominus Kill (MDC017)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703740",
      |        "startAt": "2016-07-25T21:00:00Z",
      |        "endAt": "2016-07-25T23:00:00Z"
      |    },
      |    {
      |        "id": "Merveil Kill (MDV018)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703741",
      |        "startAt": "2016-07-26T03:00:00Z",
      |        "endAt": "2016-07-26T04:00:00Z"
      |    },
      |    {
      |        "id": "DC Gravicius Kill (MDC019)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703742",
      |        "startAt": "2016-07-26T09:00:00Z",
      |        "endAt": "2016-07-26T10:00:00Z"
      |    },
      |    {
      |        "id": "Mistress of Flame Kill (MDC020)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703743",
      |        "startAt": "2016-07-26T14:00:00Z",
      |        "endAt": "2016-07-26T15:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS021)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703744",
      |        "startAt": "2016-07-26T18:00:00Z",
      |        "endAt": "2016-07-26T19:00:00Z"
      |    },
      |    {
      |        "id": "A2TMP Piety Kill (MDC022)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703745",
      |        "startAt": "2016-07-27T01:00:00Z",
      |        "endAt": "2016-07-27T03:00:00Z"
      |    },
      |    {
      |        "id": "Two Hour Solo (MDV023)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703746",
      |        "startAt": "2016-07-27T06:00:00Z",
      |        "endAt": "2016-07-27T08:00:00Z"
      |    },
      |    {
      |        "id": "1 Hour Endless Ledge (MDC024)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703747",
      |        "startAt": "2016-07-27T11:00:00Z",
      |        "endAt": "2016-07-27T12:00:00Z"
      |    },
      |    {
      |        "id": "DC Gravicius Kill (MDC025)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703748",
      |        "startAt": "2016-07-27T17:00:00Z",
      |        "endAt": "2016-07-27T18:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS026)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703749",
      |        "startAt": "2016-07-27T22:00:00Z",
      |        "endAt": "2016-07-27T23:00:00Z"
      |    },
      |    {
      |        "id": "Headhunter (MDC027)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703750",
      |        "startAt": "2016-07-28T03:00:00Z",
      |        "endAt": "2016-07-28T04:00:00Z"
      |    },
      |    {
      |        "id": "Act 3 Solo (MDV028)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703751",
      |        "startAt": "2016-07-28T09:00:00Z",
      |        "endAt": "2016-07-28T09:50:00Z"
      |    },
      |    {
      |        "id": "One Hour Party (MDV029)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703752",
      |        "startAt": "2016-07-28T14:00:00Z",
      |        "endAt": "2016-07-28T15:00:00Z"
      |    },
      |    {
      |        "id": "Onslaught Cutthroat (MDC030)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703753",
      |        "startAt": "2016-07-28T18:00:00Z",
      |        "endAt": "2016-07-28T20:00:00Z"
      |    },
      |    {
      |        "id": "Onslaught Mistress Kill (MDC031)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703754",
      |        "startAt": "2016-07-28T22:00:00Z",
      |        "endAt": "2016-07-28T23:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS032)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703755",
      |        "startAt": "2016-07-29T02:00:00Z",
      |        "endAt": "2016-07-29T03:00:00Z"
      |    },
      |    {
      |        "id": "Eternal Torment (MDC033)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703756",
      |        "startAt": "2016-07-29T07:00:00Z",
      |        "endAt": "2016-07-29T08:00:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC034A)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703757",
      |        "startAt": "2016-07-29T14:00:00Z",
      |        "endAt": "2016-07-29T14:12:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC034B)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703758",
      |        "startAt": "2016-07-29T14:20:00Z",
      |        "endAt": "2016-07-29T14:32:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC034C)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703759",
      |        "startAt": "2016-07-29T14:40:00Z",
      |        "endAt": "2016-07-29T14:52:00Z"
      |    },
      |    {
      |        "id": "Exile Onslaught (MDC035)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703760",
      |        "startAt": "2016-07-29T17:00:00Z",
      |        "endAt": "2016-07-29T19:00:00Z"
      |    },
      |    {
      |        "id": "BLMST Izaro Kill (MDC036)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703761",
      |        "startAt": "2016-07-29T20:00:00Z",
      |        "endAt": "2016-07-30T20:00:00Z"
      |    },
      |    {
      |        "id": "Headhunter (MDC037)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703762",
      |        "startAt": "2016-07-30T22:00:00Z",
      |        "endAt": "2016-07-30T23:00:00Z"
      |    },
      |    {
      |        "id": "Cutthroat (MDC038)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703763",
      |        "startAt": "2016-07-31T01:00:00Z",
      |        "endAt": "2016-07-31T05:00:00Z"
      |    },
      |    {
      |        "id": "DCO Gravicius Kill (MDC039)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703764",
      |        "startAt": "2016-07-31T06:00:00Z",
      |        "endAt": "2016-07-31T07:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS040)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703765",
      |        "startAt": "2016-07-31T10:00:00Z",
      |        "endAt": "2016-07-31T11:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS041)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703766",
      |        "startAt": "2016-07-31T14:00:00Z",
      |        "endAt": "2016-07-31T15:00:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC042A)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703767",
      |        "startAt": "2016-07-31T18:00:00Z",
      |        "endAt": "2016-07-31T18:12:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC042B)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703768",
      |        "startAt": "2016-07-31T18:20:00Z",
      |        "endAt": "2016-07-31T18:32:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC042C)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703769",
      |        "startAt": "2016-07-31T18:40:00Z",
      |        "endAt": "2016-07-31T18:52:00Z"
      |    },
      |    {
      |        "id": "Arctic Merveil Kill (MDC043)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703770",
      |        "startAt": "2016-07-31T22:00:00Z",
      |        "endAt": "2016-07-31T23:00:00Z"
      |    },
      |    {
      |        "id": "Eternal Torment Nemesis (MDC044)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703771",
      |        "startAt": "2016-08-01T02:00:00Z",
      |        "endAt": "2016-08-01T03:00:00Z"
      |    },
      |    {
      |        "id": "30m Winterheart Ledge (MDC045)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703772",
      |        "startAt": "2016-08-01T06:00:00Z",
      |        "endAt": "2016-08-01T06:30:00Z"
      |    },
      |    {
      |        "id": "Mistress of Flame Kill (MDC046)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703773",
      |        "startAt": "2016-08-01T10:00:00Z",
      |        "endAt": "2016-08-01T11:00:00Z"
      |    },
      |    {
      |        "id": "DC Gravicius Kill (MDC047)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703774",
      |        "startAt": "2016-08-01T14:00:00Z",
      |        "endAt": "2016-08-01T15:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS048)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703775",
      |        "startAt": "2016-08-01T18:00:00Z",
      |        "endAt": "2016-08-01T19:00:00Z"
      |    },
      |    {
      |        "id": "Act 2 Solo (MDV049)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703776",
      |        "startAt": "2016-08-01T22:00:00Z",
      |        "endAt": "2016-08-01T22:45:00Z"
      |    },
      |    {
      |        "id": "A3 Lethal Dominus Kill (MDC050)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703777",
      |        "startAt": "2016-08-02T03:00:00Z",
      |        "endAt": "2016-08-02T05:00:00Z"
      |    },
      |    {
      |        "id": "One Hour Party (MDV051)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703778",
      |        "startAt": "2016-08-02T10:00:00Z",
      |        "endAt": "2016-08-02T11:00:00Z"
      |    },
      |    {
      |        "id": "Mistress of Flame Kill (MDC052)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703779",
      |        "startAt": "2016-08-02T17:00:00Z",
      |        "endAt": "2016-08-02T18:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS053)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703780",
      |        "startAt": "2016-08-02T22:00:00Z",
      |        "endAt": "2016-08-02T23:00:00Z"
      |    },
      |    {
      |        "id": "Exiles Everywhere (MDC054)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703781",
      |        "startAt": "2016-08-03T02:00:00Z",
      |        "endAt": "2016-08-03T03:00:00Z"
      |    },
      |    {
      |        "id": "Brutus Kill (MDV055)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703782",
      |        "startAt": "2016-08-03T07:00:00Z",
      |        "endAt": "2016-08-03T08:00:00Z"
      |    },
      |    {
      |        "id": "2h BLAMT Party (MDC056)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703783",
      |        "startAt": "2016-08-03T14:00:00Z",
      |        "endAt": "2016-08-03T16:00:00Z"
      |    },
      |    {
      |        "id": "One Hour Solo (MDV057)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703784",
      |        "startAt": "2016-08-03T18:00:00Z",
      |        "endAt": "2016-08-03T19:00:00Z"
      |    },
      |    {
      |        "id": "DC Gravicius Kill (MDC058)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703785",
      |        "startAt": "2016-08-03T22:00:00Z",
      |        "endAt": "2016-08-03T23:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS059)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703786",
      |        "startAt": "2016-08-04T02:00:00Z",
      |        "endAt": "2016-08-04T03:00:00Z"
      |    },
      |    {
      |        "id": "Act 3 Solo (MDV060)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703787",
      |        "startAt": "2016-08-04T09:00:00Z",
      |        "endAt": "2016-08-04T09:50:00Z"
      |    },
      |    {
      |        "id": "A2TMP Piety Kill (MDC061)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703788",
      |        "startAt": "2016-08-04T16:00:00Z",
      |        "endAt": "2016-08-04T18:00:00Z"
      |    },
      |    {
      |        "id": "1h Winterheart Ledge (MDC062)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703789",
      |        "startAt": "2016-08-04T22:00:00Z",
      |        "endAt": "2016-08-04T23:00:00Z"
      |    },
      |    {
      |        "id": "Mistress of Flame Kill (MDC063)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703790",
      |        "startAt": "2016-08-05T02:00:00Z",
      |        "endAt": "2016-08-05T03:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS064)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703791",
      |        "startAt": "2016-08-05T06:00:00Z",
      |        "endAt": "2016-08-05T07:00:00Z"
      |    },
      |    {
      |        "id": "One Hour Party (MDV065)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703792",
      |        "startAt": "2016-08-05T13:00:00Z",
      |        "endAt": "2016-08-05T14:00:00Z"
      |    },
      |    {
      |        "id": "Cutthroat (MDC066)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703793",
      |        "startAt": "2016-08-05T17:00:00Z",
      |        "endAt": "2016-08-05T21:00:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC067A)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703794",
      |        "startAt": "2016-08-05T23:00:00Z",
      |        "endAt": "2016-08-05T23:12:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC067B)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703795",
      |        "startAt": "2016-08-05T23:20:00Z",
      |        "endAt": "2016-08-05T23:32:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC067C)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703796",
      |        "startAt": "2016-08-05T23:40:00Z",
      |        "endAt": "2016-08-05T23:52:00Z"
      |    },
      |    {
      |        "id": "DC Gravicius Kill (MDC068)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703797",
      |        "startAt": "2016-08-06T06:00:00Z",
      |        "endAt": "2016-08-06T07:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS069)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703798",
      |        "startAt": "2016-08-06T10:00:00Z",
      |        "endAt": "2016-08-06T11:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS070)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703799",
      |        "startAt": "2016-08-06T14:00:00Z",
      |        "endAt": "2016-08-06T15:00:00Z"
      |    },
      |    {
      |        "id": "30 Min Endless Ledge (MDC071)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703800",
      |        "startAt": "2016-08-06T17:00:00Z",
      |        "endAt": "2016-08-06T17:30:00Z"
      |    },
      |    {
      |        "id": "A2TMP Piety Kill (MDC072)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703801",
      |        "startAt": "2016-08-06T20:00:00Z",
      |        "endAt": "2016-08-06T22:00:00Z"
      |    },
      |    {
      |        "id": "OHAA Malachai Kill (MDC073)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703802",
      |        "startAt": "2016-08-07T01:00:00Z",
      |        "endAt": "2016-08-07T06:00:00Z"
      |    },
      |    {
      |        "id": "Onslaught Mistress Kill (MDC074)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703803",
      |        "startAt": "2016-08-07T10:00:00Z",
      |        "endAt": "2016-08-07T11:00:00Z"
      |    },
      |    {
      |        "id": "DC Gravicius Kill (MDC075)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703804",
      |        "startAt": "2016-08-07T14:00:00Z",
      |        "endAt": "2016-08-07T15:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS076)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703805",
      |        "startAt": "2016-08-07T18:00:00Z",
      |        "endAt": "2016-08-07T19:00:00Z"
      |    },
      |    {
      |        "id": "Mistress of Flame Kill (MDC077)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703806",
      |        "startAt": "2016-08-08T01:00:00Z",
      |        "endAt": "2016-08-08T02:00:00Z"
      |    },
      |    {
      |        "id": "Two Hour Solo (MDV078)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703807",
      |        "startAt": "2016-08-08T06:00:00Z",
      |        "endAt": "2016-08-08T08:00:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC079A)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703808",
      |        "startAt": "2016-08-08T11:00:00Z",
      |        "endAt": "2016-08-08T11:12:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC079B)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703809",
      |        "startAt": "2016-08-08T11:20:00Z",
      |        "endAt": "2016-08-08T11:32:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC079C)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703810",
      |        "startAt": "2016-08-08T11:40:00Z",
      |        "endAt": "2016-08-08T11:52:00Z"
      |    },
      |    {
      |        "id": "Mistress of Flame Kill (MDC080)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703811",
      |        "startAt": "2016-08-08T17:00:00Z",
      |        "endAt": "2016-08-08T18:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS081)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703812",
      |        "startAt": "2016-08-08T22:00:00Z",
      |        "endAt": "2016-08-08T23:00:00Z"
      |    },
      |    {
      |        "id": "Act 3 Solo (MDV082)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703813",
      |        "startAt": "2016-08-09T03:00:00Z",
      |        "endAt": "2016-08-09T03:50:00Z"
      |    },
      |    {
      |        "id": "Exiles Everywhere (MDC083)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703814",
      |        "startAt": "2016-08-09T09:00:00Z",
      |        "endAt": "2016-08-09T10:00:00Z"
      |    },
      |    {
      |        "id": "One Hour Solo (MDV084)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703815",
      |        "startAt": "2016-08-09T14:00:00Z",
      |        "endAt": "2016-08-09T15:00:00Z"
      |    },
      |    {
      |        "id": "Act 2 Dominus Kill (MDC085)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703816",
      |        "startAt": "2016-08-09T18:00:00Z",
      |        "endAt": "2016-08-09T20:00:00Z"
      |    },
      |    {
      |        "id": "DC Gravicius Kill (MDC086)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703817",
      |        "startAt": "2016-08-09T22:00:00Z",
      |        "endAt": "2016-08-09T23:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS087)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703818",
      |        "startAt": "2016-08-10T02:00:00Z",
      |        "endAt": "2016-08-10T03:00:00Z"
      |    },
      |    {
      |        "id": "Act 2 Solo (MDV088)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703819",
      |        "startAt": "2016-08-10T07:00:00Z",
      |        "endAt": "2016-08-10T07:45:00Z"
      |    },
      |    {
      |        "id": "Brutus Kill (MDV089)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703820",
      |        "startAt": "2016-08-10T13:00:00Z",
      |        "endAt": "2016-08-10T14:00:00Z"
      |    },
      |    {
      |        "id": "Headhunter (MDC090)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703821",
      |        "startAt": "2016-08-10T19:00:00Z",
      |        "endAt": "2016-08-10T20:00:00Z"
      |    },
      |    {
      |        "id": "1 Hour Endless Ledge (MDC091)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703822",
      |        "startAt": "2016-08-11T01:00:00Z",
      |        "endAt": "2016-08-11T02:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS092)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703823",
      |        "startAt": "2016-08-11T06:00:00Z",
      |        "endAt": "2016-08-11T07:00:00Z"
      |    },
      |    {
      |        "id": "Eternal Torment (MDC093)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703824",
      |        "startAt": "2016-08-11T10:00:00Z",
      |        "endAt": "2016-08-11T11:00:00Z"
      |    },
      |    {
      |        "id": "Merveil Kill (MDV094)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703825",
      |        "startAt": "2016-08-11T17:00:00Z",
      |        "endAt": "2016-08-11T18:00:00Z"
      |    },
      |    {
      |        "id": "Exile Onslaught (MDC095)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703826",
      |        "startAt": "2016-08-11T22:00:00Z",
      |        "endAt": "2016-08-12T00:00:00Z"
      |    },
      |    {
      |        "id": "1h BLAMT Party (MDC096)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703827",
      |        "startAt": "2016-08-12T02:00:00Z",
      |        "endAt": "2016-08-12T03:00:00Z"
      |    },
      |    {
      |        "id": "DC Gravicius Kill (MDC097)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703828",
      |        "startAt": "2016-08-12T06:00:00Z",
      |        "endAt": "2016-08-12T07:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS098)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703829",
      |        "startAt": "2016-08-12T10:00:00Z",
      |        "endAt": "2016-08-12T11:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS099)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703830",
      |        "startAt": "2016-08-12T14:00:00Z",
      |        "endAt": "2016-08-12T15:00:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC100A)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703831",
      |        "startAt": "2016-08-12T18:00:00Z",
      |        "endAt": "2016-08-12T18:12:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC100B)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703832",
      |        "startAt": "2016-08-12T18:20:00Z",
      |        "endAt": "2016-08-12T18:32:00Z"
      |    },
      |    {
      |        "id": "12 Min Burst (MDC100C)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703833",
      |        "startAt": "2016-08-12T18:40:00Z",
      |        "endAt": "2016-08-12T18:52:00Z"
      |    },
      |    {
      |        "id": "48 Hour Flashback Solo (MDC101)",
      |        "url": null,
      |        "startAt": "2016-08-12T23:00:00Z",
      |        "endAt": null
      |    },
      |    {
      |        "id": "Medallion (MDS102)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703835",
      |        "startAt": "2016-08-15T00:00:00Z",
      |        "endAt": "2016-08-15T01:00:00Z"
      |    },
      |    {
      |        "id": "Headhunter (MDC103)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703836",
      |        "startAt": "2016-08-15T02:00:00Z",
      |        "endAt": "2016-08-15T03:00:00Z"
      |    },
      |    {
      |        "id": "A2TMP Piety Kill (MDC104)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703837",
      |        "startAt": "2016-08-15T06:00:00Z",
      |        "endAt": "2016-08-15T08:00:00Z"
      |    },
      |    {
      |        "id": "One Hour Party (MDV105)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703838",
      |        "startAt": "2016-08-15T11:00:00Z",
      |        "endAt": "2016-08-15T12:00:00Z"
      |    },
      |    {
      |        "id": "A3 Lethal Dominus Kill (MDC106)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703839",
      |        "startAt": "2016-08-15T17:00:00Z",
      |        "endAt": "2016-08-15T19:00:00Z"
      |    },
      |    {
      |        "id": "Mistress of Flame Kill (MDC107)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703840",
      |        "startAt": "2016-08-15T22:00:00Z",
      |        "endAt": "2016-08-15T23:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS108)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703841",
      |        "startAt": "2016-08-16T02:00:00Z",
      |        "endAt": "2016-08-16T03:00:00Z"
      |    },
      |    {
      |        "id": "Act 2 Solo (MDV109)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703842",
      |        "startAt": "2016-08-16T09:00:00Z",
      |        "endAt": "2016-08-16T09:45:00Z"
      |    },
      |    {
      |        "id": "Brutus Kill (MDV110)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703843",
      |        "startAt": "2016-08-16T17:00:00Z",
      |        "endAt": "2016-08-16T18:00:00Z"
      |    },
      |    {
      |        "id": "30m Winterheart Ledge (MDC111)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703844",
      |        "startAt": "2016-08-16T22:00:00Z",
      |        "endAt": "2016-08-16T22:30:00Z"
      |    },
      |    {
      |        "id": "DC Gravicius Kill (MDC112)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703845",
      |        "startAt": "2016-08-17T02:00:00Z",
      |        "endAt": "2016-08-17T03:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS113)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703846",
      |        "startAt": "2016-08-17T06:00:00Z",
      |        "endAt": "2016-08-17T07:00:00Z"
      |    },
      |    {
      |        "id": "Eternal Torment Nemesis (MDC114)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703847",
      |        "startAt": "2016-08-17T14:00:00Z",
      |        "endAt": "2016-08-17T15:00:00Z"
      |    },
      |    {
      |        "id": "One Hour Solo (MDV115)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703848",
      |        "startAt": "2016-08-17T18:00:00Z",
      |        "endAt": "2016-08-17T19:00:00Z"
      |    },
      |    {
      |        "id": "Act 3 Solo (MDV116)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703849",
      |        "startAt": "2016-08-17T21:00:00Z",
      |        "endAt": "2016-08-17T21:50:00Z"
      |    },
      |    {
      |        "id": "2h BLAMT Party (MDC117)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703850",
      |        "startAt": "2016-08-18T02:00:00Z",
      |        "endAt": "2016-08-18T04:00:00Z"
      |    },
      |    {
      |        "id": "Mistress of Flame Kill (MDC118)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703851",
      |        "startAt": "2016-08-18T06:00:00Z",
      |        "endAt": "2016-08-18T07:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS119)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703852",
      |        "startAt": "2016-08-18T10:00:00Z",
      |        "endAt": "2016-08-18T11:00:00Z"
      |    },
      |    {
      |        "id": "Medallion (MDS120)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703853",
      |        "startAt": "2016-08-18T14:00:00Z",
      |        "endAt": "2016-08-18T15:00:00Z"
      |    },
      |    {
      |        "id": "Arctic Merveil Kill (MDC121)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703854",
      |        "startAt": "2016-08-18T18:00:00Z",
      |        "endAt": "2016-08-18T19:00:00Z"
      |    },
      |    {
      |        "id": "Exile Onslaught (MDC122)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703855",
      |        "startAt": "2016-08-18T22:00:00Z",
      |        "endAt": "2016-08-19T00:00:00Z"
      |    },
      |    {
      |        "id": "Onslaught Cutthroat (MDC123)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703856",
      |        "startAt": "2016-08-19T02:00:00Z",
      |        "endAt": "2016-08-19T04:00:00Z"
      |    },
      |    {
      |        "id": "1h Winterheart Ledge (MDC124)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703857",
      |        "startAt": "2016-08-19T06:00:00Z",
      |        "endAt": "2016-08-19T07:00:00Z"
      |    },
      |    {
      |        "id": "DCO Gravicius Kill (MDC125)",
      |        "url": "http:\/\/pathofexile.com\/forum\/view-thread\/1703858",
      |        "startAt": "2016-08-19T10:00:00Z",
      |        "endAt": "2016-08-19T11:00:00Z"
      |    }
      |]
    """.stripMargin

}
