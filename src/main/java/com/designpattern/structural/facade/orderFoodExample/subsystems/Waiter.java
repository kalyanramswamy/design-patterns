package com.designpattern.structural.facade.orderFoodExample.subsystems;

public class Waiter {
    public void writeOrder() {
        System.out.println("Waiter writes client food order");
    }

    public void sendToKitchen() {
        System.out.println("Send order to kitchen");
    }

    public void serveCustomer() {
        System.out.println("Yeeei customer is served!!!");
    }
}
