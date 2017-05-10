package exception

import akka.http.scaladsl.model.StatusCode

sealed trait PathOfExileClientException

sealed trait HttpException extends PathOfExileClientException
final case class GeneralHttpException(msg: String) extends Exception(msg) with HttpException
final case class BadHttpStatusException(statusCode: StatusCode, msg: String) extends Exception(msg) with HttpException
