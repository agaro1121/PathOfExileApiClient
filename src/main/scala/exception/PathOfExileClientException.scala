package exception

import akka.http.scaladsl.model.StatusCode

// TODO: do they need to be exceptions
sealed trait PathOfExileClientException

sealed trait HttpException extends PathOfExileClientException
final case class GeneralHttpException(msg: String) extends Exception(msg) with HttpException
final case class BadHttpStatusException(statusCode: StatusCode, msg: String) extends Exception(msg) with HttpException

sealed trait BadLeaguesEndpointArgument extends PathOfExileClientException
final case class SeasonNotSpecifiedException(msg: String) extends Exception(msg) with BadLeaguesEndpointArgument
final case class LeagueCompactException(msg: String) extends Exception(msg) with BadLeaguesEndpointArgument
final case class LeagueLimitException(msg: String) extends Exception(msg) with BadLeaguesEndpointArgument

sealed trait BadLeagueEndpointArgument extends PathOfExileClientException
final case class BadLadderException(msg: String) extends Exception(msg) with BadLeagueEndpointArgument
final case class BadLadderLimitException(msg: String) extends Exception(msg) with BadLeagueEndpointArgument
final case class BadLadderTrackLimitException(msg: String) extends Exception(msg) with BadLeagueEndpointArgument

sealed trait BadLaddersEndpointArgument extends PathOfExileClientException
final case class BadLimitException(msg: String) extends Exception(msg) with BadLaddersEndpointArgument
final case class BadDifficultyException(msg: String) extends Exception(msg) with BadLaddersEndpointArgument
final case class BadStartException(msg: String) extends Exception(msg) with BadLaddersEndpointArgument