package com.designpattern.behavioral.mediator.wizardPartyExample.action;

public enum Action {

  TALE("tells a tale", "comes to listen"),
  ENEMY("spotted enemies", "runs for cover");

  private String title;
  private String description;

  Action(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public String toString() {
    return title;
  }
}