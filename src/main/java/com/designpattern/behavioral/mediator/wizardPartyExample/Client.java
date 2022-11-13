package com.designpattern.behavioral.mediator.wizardPartyExample;

import com.designpattern.behavioral.mediator.wizardPartyExample.action.Action;
import com.designpattern.behavioral.mediator.wizardPartyExample.members.Hobbit;
import com.designpattern.behavioral.mediator.wizardPartyExample.members.Wizard;
import com.designpattern.behavioral.mediator.wizardPartyExample.party.Party;
import com.designpattern.behavioral.mediator.wizardPartyExample.party.PartyImpl;

public class Client {
    public static void main(String[] args) {
        Party party = new PartyImpl();

        Hobbit hobbit = new Hobbit();
        Wizard wizard = new Wizard();

        party.addMember(hobbit);
        party.addMember(wizard);

        hobbit.act(Action.ENEMY);
        wizard.act(Action.TALE);
    }
}
