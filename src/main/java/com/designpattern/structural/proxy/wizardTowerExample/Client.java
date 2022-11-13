package com.designpattern.structural.proxy.wizardTowerExample;

import com.designpattern.structural.proxy.wizardTowerExample.tower.IvoryTower;
import com.designpattern.structural.proxy.wizardTowerExample.tower.ProxyWizardTower;
import com.designpattern.structural.proxy.wizardTowerExample.wizard.Wizard;

public class Client {
    public static void main(String[] args) {
        ProxyWizardTower proxyWizardTower = new ProxyWizardTower(new IvoryTower());
        proxyWizardTower.enter(new Wizard("Red Wizard"));
        proxyWizardTower.enter(new Wizard("Brown Wizard"));
        proxyWizardTower.enter(new Wizard("Weight Wizard"));
        proxyWizardTower.enter(new Wizard("Black Wizard"));
    }
}
