package com.designpattern.structural.proxy.wizardTowerExample.tower;

import com.designpattern.structural.proxy.wizardTowerExample.wizard.Wizard;

public class IvoryTower implements WizardTower {

  public void enter(Wizard wizard) {
    System.out.println(wizard + " enters the tower.");
  }

}