package com.designpattern.structural.decorator.coffeeExample.concreteDecorator;

import com.designpattern.structural.decorator.coffeeExample.component.Coffee;
import com.designpattern.structural.decorator.coffeeExample.decorator.CoffeeDecorator;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee c) {
        coffee = c;
        description = "Milk";
    }

    @Override
    public float getCost() {
        return coffee.getCost() * 3.2f;
    }
}
