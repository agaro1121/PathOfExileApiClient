package http

import marshalling._

package object client {

  trait allmashalling
    extends LadderMarshalling
    with LeagueRulesMarshalling
    with LeaguesMarshalling
    with PvpMatchesMarshalling
    with StashesMarshalling

  trait allValidators
    extends LaddersEndpointArgsValidator
    with LeagueEndpointArgsValidators
    with LeaguesEndpointArgsValidators

}
