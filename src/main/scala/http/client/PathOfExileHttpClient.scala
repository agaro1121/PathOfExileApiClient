package http.client

import java.time.ZonedDateTime
import scala.concurrent.Future
import akka.actor.ActorSystem
import akka.stream.Materializer
import models.ladder.{Ladder, LadderType}
import models.leaguerules.{LeagueRule, LeagueRules}
import models.pvpmatches.PvpMatches
import config.PathOfExileHttpConfig
import models.stashes.Stashes
import models.leagues.{LadderDifficulty, League, LeagueType, Leagues}
import exception._
import cats.implicits._
import cats.data.ValidatedNel
import marshalling.AllMarshalling

class PathOfExileHttpClient(val config: PathOfExileHttpConfig)
                           (implicit protected val actorSystem: ActorSystem, protected val mat: Materializer)
  extends HttpClientPlumbing with AllMarshalling with AllValidators {
  /**
   *
   * Retrieves a list of stashes, accounts, and items as described above in the Introduction section.
   *
   * If there are no changes, this page will show as empty.
   * You need to simply retry this same page no quicker than every one second.
   *
   * @param stashId The next change ID you received from previously fetching changes.
   *                Default: 0
   *
   */
  def getStashes(stashId: Option[String] = None): Future[Either[HttpError, Stashes]] =
    getAndHandleResponse(config.`public-stash-tabs`, stashId.map(id => Map("id" -> id))).as[Stashes]

  /**
   *
   * Get a list of current and past leagues.
   *
   * @param type    Possible values:
   *                -"all": retrieves all leagues (the default)
   *                -"main": retrieves main leagues (ones from the character screen)
   *                -"event": retrieves event leagues
   *                -"season": retrieves leagues in a particular season
   * @param season  A particular season id.
   *                Required when type=season.
   * @param compact Possible values:
   *                -"0": Displays the full info for leagues retrieved (will only retrieve a maximum of 50 leagues) (the default)
   *                -"1": Display compact info for leagues retrieved (will retrieve up to 230 leagues)
   * @param limit   This specifies the number of league entries to include.
   *                By default this is the maximum, which depends on the setting above.
   * @param offset  This specifies the offset to the first league entry to include.
   *                Default: 0
   *
   */
  def getLeagues(
    `type`: Option[LeagueType] = None,
    season: Option[String] = None,
    compact: Option[Int] = None,
    limit: Option[Int] = None,
    offset: Option[Int] = None
  ): ValidatedNel[BadLeaguesEndpointArgument, Future[Either[HttpError, Leagues]]] = {

    (validateSeason(`type`, season) |@| validateCompact(compact) |@| validateLimit(compact, limit)).map {
      (validSeason, validCompact, validLimit) =>

        val queryParams: Map[String, String] =
          List(
            `type`.map(t => "type" -> t.toString),
            validSeason.map(s => "season" -> s),
            validCompact.map(c => "compact" -> c.toString),
            validLimit.map(l => "limit" -> l.toString),
            offset.map(o => "offset" -> o.toString)
          ).flatten.toMap

        getAndHandleResponse(config.leagues, Some(queryParams)).as[Leagues]
    }

  }

  /**
   *
   * Get a single league by id.
   *
   * @param id The id (name) of the league.
   *
   * @param ladder Set to 1 to include the ladder in the response.
   *               The ladder will be in included in the "ladder" key.
   *               Defaults to 0, excluding the ladder.
   *
   * @param ladderLimit When including the ladder with ladder=1,
   *                    this specifies the number of ladder entries to include.
   *                    Default: 20
   *                    Max: 200
   *
   * @param ladderOffset When including the ladder with ladder=1,
   *                     this specifies the offset to the first ladder entry to include.
   *                     Default: 0
   *
   * @param ladderTrack When including the ladder with ladder=1,
   *                    this setting adds unique IDs for each character returned.
   *                    These can be used when name conflicts occur.
   */
  def getLeague(
    id: String,
    ladder: Option[Int] = None,
    ladderLimit: Option[Int] = None,
    ladderOffset: Option[Int] = None,
    ladderTrack: Option[Int] = None
  ): ValidatedNel[BadLeagueEndpointArgument, Future[Either[HttpError, League]]] = {

    (validateLadder(ladder) |@| validateLadderLimit(ladder, ladderLimit) |@|
      validateLadderOffset(ladder, ladderOffset) |@| validateLadderTrack(ladder, ladderTrack)).map {
        (validLadder, validLadderLimit, validLadderOffset, validLadderTrack) =>

          val queryParams: Map[String, String] =
            List(
              validLadder.map(l => "ladder" -> l.toString),
              validLadderLimit.map(l => "ladderLimit" -> l.toString),
              validLadderOffset.map(l => "ladderOffset" -> l.toString),
              validLadderTrack.map(l => "ladderTrack" -> l.toString)
            ).flatten.toMap + (("id", id.toString))

          getAndHandleResponse(config.leagues, Some(queryParams)).as[League]
      }

  }

  /**
   *
   * Get a ladder by league id.
   *
   * There is a restriction in place on the last ladder entry you are able to retrieve which is set to 15000.
   *
   * @param id The id (name) of the league for the ladder you want to retrieve.
   *
   * @param limit Specifies the number of ladder entries to include.
   *              Default: 20.
   *              Max: 200.
   *
   * @param offset Specifies the offset to the first ladder entry to include.
   *               Default: 0.
   *
   * @param type Specifies the type of ladder,
   *             Options: [league (default), pvp, labyrinth]
   *
   * @param track When set to true, adds unique IDs for each character returned.
   *              These can be used when name conflicts occur.
   *
   * @param difficulty Labyrinth only
   *                   Options: Standard (1), Cruel (2) or Merciless (3)
   *
   * @param start Labyrinth only
   *              Timestamp of the ladder you want.
   *
   */
  def getLadder(
    id: String,
    limit: Option[Int] = None,
    offset: Option[Int] = None,
    `type`: Option[LadderType] = None,
    track: Option[Boolean] = None,
    difficulty: Option[LadderDifficulty] = None,
    start: Option[ZonedDateTime] = None
  ): ValidatedNel[BadLadderEndpointArgument, Future[Either[HttpError, Ladder]]] = {

    (validateLimit(limit) |@| validateDifficulty(`type`, difficulty) |@| validateStart(`type`, start)).map {
      (validLimit, validDifficulty, validStart) =>

        val queryParams: Map[String, String] = List(
          validLimit.map(l => "limit" -> l.toString),
          offset.map(o => "offset" -> o.toString),
          `type`.map(t => "`type`" -> t.toString),
          track.map(t => "track" -> t.toString),
          validDifficulty.map(d => "difficulty" -> d.toString),
          validStart.map(s => "start" -> s.toString)
        ).flatten.toMap + (("id", id))

        getAndHandleResponse(config.ladders, Some(queryParams)).as[Ladder]
    }

  }

  /**
   *
   * Get a list of all possible league rules.
   *
   */
  def getLeagueRules: Future[Either[HttpError, LeagueRules]] =
    getAndHandleResponse(config.`league-rules`).as[LeagueRules]

  /**
   * Get a single league rule by id.
   *
   * @param id The rule id.
   */
  def getLeagueRule(id: Int): Future[Either[HttpError, LeagueRule]] =
    getAndHandleResponse(config.`league-rules`, Some(Map("id" -> id.toString))).as[LeagueRule]

  /**
   *
   * Get a list of PvP matches.
   *
   * @param seasonId Set this to get PvP matches for a particular season.
   *                 Leave this unset to retrieve all upcoming PvP matches.
   *
   */
  def getPvpMatches(seasonId: Option[String] = None): Future[Either[HttpError, PvpMatches]] =
    getAndHandleResponse(config.`pvp-matches`, seasonId.map(sid => Map("seasonId" -> sid.toString))).as[PvpMatches]

}

object PathOfExileHttpClient {
  def apply(config: PathOfExileHttpConfig = PathOfExileHttpConfig.default)
           (implicit actorSystem: ActorSystem, mat: Materializer): PathOfExileHttpClient =
    new PathOfExileHttpClient(config)
}
