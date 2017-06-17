package com.github.agaro1121.exception

import akka.http.scaladsl.model.StatusCode

sealed trait PathOfExileClientError

sealed trait HttpError extends PathOfExileClientError
final case class GeneralHttpException(msg: String) extends HttpError
final case class BadHttpStatus(statusCode: StatusCode, msg: String) extends HttpError

sealed trait BadLeaguesEndpointArgument extends PathOfExileClientError
final case class SeasonNotSpecified(msg: String) extends BadLeaguesEndpointArgument
final case class BadLeagueCompact(msg: String) extends BadLeaguesEndpointArgument
final case class BadLeagueLimit(msg: String) extends BadLeaguesEndpointArgument

sealed trait BadLeagueEndpointArgument extends PathOfExileClientError
final case class BadLadder(msg: String) extends BadLeagueEndpointArgument
final case class BadLadderLimit(msg: String) extends BadLeagueEndpointArgument
final case class BadLadderTrack(msg: String) extends BadLeagueEndpointArgument

sealed trait BadLadderEndpointArgument extends PathOfExileClientError
final case class BadLimit(msg: String) extends BadLadderEndpointArgument
final case class BadDifficulty(msg: String) extends BadLadderEndpointArgument
final case class BadStart(msg: String) extends BadLadderEndpointArgument

final case class MissingConfiguration(msg: String) extends Exception(msg) with PathOfExileClientError
