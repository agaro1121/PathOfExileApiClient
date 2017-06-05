package models.pvpmatches

case class PvpMatch(
                     id: String,
                     startAt: String,
                     endAt: String,
                     url: String,
                     description: String,
                     glickoRatings: Boolean,
                     pvp: Boolean,
                     style: String,
                     registerAt: String
                   )

case class PvpMatches(pvpMatches: Seq[PvpMatch])