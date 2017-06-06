import de.heikoseeberger.akkahttpcirce.CirceSupport

package object marshalling {

  trait AllMarshalling
    extends LadderMarshalling
      with LeagueRulesMarshalling
      with LeaguesMarshalling
      with PvpMatchesMarshalling
      with StashesMarshalling
      with CirceSupport

}
