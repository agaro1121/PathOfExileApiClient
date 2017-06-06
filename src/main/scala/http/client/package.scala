package http

package object client {

  trait AllValidators
    extends LadderEndpointArgsValidator
    with LeagueEndpointArgsValidators
    with LeaguesEndpointArgsValidators

}
