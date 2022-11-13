package com.designpattern.structural.facade.orderFoodExample.subsystems;

public class Kitchen {
    public void prepareFood() {
        System.out.println("Cook food");
    }

    public void callWaiter() {
        System.out.println("Call Waiter");
    }

    public void washDishes() {
        System.out.println("Wash the dishes");
    }
}
