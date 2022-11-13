package com.designpattern.behavioral.mediator.wizardPartyExample.members;

import com.designpattern.behavioral.mediator.wizardPartyExample.action.Action;
import com.designpattern.behavioral.mediator.wizardPartyExample.party.Party;

public abstract class PartyMember {
    protected Party party;

    public void joinedParty(Party party) {
        System.out.println(this + " joins the party");
        this.party = party;
    }

    public void partyAction(Action action) {
        System.out.println( this + " " +action.getDescription());
    }

    public void act(Action action) {
        if (party != null) {
            System.out.println(this + " " + action);
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}
