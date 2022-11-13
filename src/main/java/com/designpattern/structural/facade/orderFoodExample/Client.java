package com.designpattern.structural.facade.orderFoodExample;

import com.designpattern.structural.facade.orderFoodExample.facade.OrderFacade;

public class Client {
    public static void main(String[] args) {
        OrderFacade order = new OrderFacade();
        order.orderFood();
    }
}
