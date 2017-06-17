package com.github.agaro1121

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
