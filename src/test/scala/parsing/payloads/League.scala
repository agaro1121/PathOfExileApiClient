package parsing.payloads

object League {

  val payload =
    """
      |{
      |  "id": "Hardcore",
      |  "description": "A character killed in the Hardcore league is moved to the Standard league.",
      |  "registerAt": null,
      |  "event": false,
      |  "url": "http://pathofexile.com/forum/view-thread/71276",
      |  "startAt": "2013-01-23T21:00:00Z",
      |  "endAt": null,
      |  "rules": [
      |    {
      |      "id": 4,
      |      "name": "Hardcore",
      |      "description": "A character killed in Hardcore is moved to its parent league."
      |    }
      |  ]
      |}
    """.stripMargin

}
