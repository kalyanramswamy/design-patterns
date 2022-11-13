package com.designpattern.structural.facade.goldMineExample;

import com.designpattern.structural.facade.goldMineExample.facade.GoldmineFacade;

public class Client {
    public static void main(String[] args) {
        GoldmineFacade facade = new GoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
