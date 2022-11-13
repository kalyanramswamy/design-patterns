package com.designpattern.structural.decorator.coffeeExample.concreteComponent;

import com.designpattern.structural.decorator.coffeeExample.component.Coffee;

public class Latte extends Coffee {
    public Latte() {
        description = "Latte";
    }

    @Override
    public float getCost() {
        return 3.0f;
    }
}
