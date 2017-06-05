package http

package object client {

  trait AllValidators
    extends LaddersEndpointArgsValidator
    with LeagueEndpointArgsValidators
    with LeaguesEndpointArgsValidators

}
