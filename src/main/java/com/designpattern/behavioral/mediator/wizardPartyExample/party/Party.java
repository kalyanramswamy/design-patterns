package com.designpattern.behavioral.mediator.wizardPartyExample.party;

import com.designpattern.behavioral.mediator.wizardPartyExample.action.Action;
import com.designpattern.behavioral.mediator.wizardPartyExample.members.PartyMember;

public interface Party {

  void addMember(PartyMember member);

  void act(PartyMember actor, Action action);

}