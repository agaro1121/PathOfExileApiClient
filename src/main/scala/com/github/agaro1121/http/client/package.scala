package com.github.agaro1121.http

package object client {

  trait AllValidators
    extends LadderEndpointArgsValidator
    with LeagueEndpointArgsValidators
    with LeaguesEndpointArgsValidators

}
