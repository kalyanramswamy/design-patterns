package com.designpattern.structural.facade.orderFoodExample.facade;

import com.designpattern.structural.facade.orderFoodExample.subsystems.Kitchen;
import com.designpattern.structural.facade.orderFoodExample.subsystems.Waiter;

public class OrderFacade {
    public void orderFood() {
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();

        waiter.writeOrder();
        waiter.sendToKitchen();
        kitchen.prepareFood();
        kitchen.callWaiter();
        waiter.serveCustomer();
        kitchen.washDishes();
    }
}
