package com.designpattern.structural.proxy.wizardTowerExample.tower;

import com.designpattern.structural.proxy.wizardTowerExample.wizard.Wizard;

public class ProxyWizardTower implements WizardTower {
    WizardTower tower;

    private final int TOTAL_TOWER_WIZARD_CAPACITY = 3;
    private int totalWizards;

    public ProxyWizardTower(WizardTower wizardTower) {
        this.tower = wizardTower;
    }

    @Override
    public void enter(Wizard wizard) {
        if(totalWizards < TOTAL_TOWER_WIZARD_CAPACITY) {
            System.out.println(wizard.toString() + " Entered the tower.");
            totalWizards++;
        } else {
            System.out.println(wizard.toString() + " Not allowed to enter the tower.");
        }
    }
}
