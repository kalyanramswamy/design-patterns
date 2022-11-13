package com.designpattern.structural.decorator.coffeeExample.concreteDecorator;

import com.designpattern.structural.decorator.coffeeExample.component.Coffee;
import com.designpattern.structural.decorator.coffeeExample.decorator.CoffeeDecorator;

public class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee c) {
        coffee = c;
        description = "Chocolate";
    }

    @Override
    public float getCost() {
        return coffee.getCost() * 1.5f;
    }
}
