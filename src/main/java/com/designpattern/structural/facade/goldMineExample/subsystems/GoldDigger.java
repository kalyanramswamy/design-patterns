package com.designpattern.structural.facade.goldMineExample.subsystems;

public class GoldDigger extends MineWorker {
    @Override
    public void work() {
        System.out.println(name() + " digs for gold.");
    }

    @Override
    public String name() {
        return "Gold Digger";
    }
}
