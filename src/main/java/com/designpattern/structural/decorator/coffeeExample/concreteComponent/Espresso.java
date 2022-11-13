package com.designpattern.structural.decorator.coffeeExample.concreteComponent;

import com.designpattern.structural.decorator.coffeeExample.component.Coffee;

public class Espresso extends Coffee {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public float getCost() {
        return 5.0f;
    }
}
