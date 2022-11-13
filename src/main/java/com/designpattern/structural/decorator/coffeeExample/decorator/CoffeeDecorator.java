package com.designpattern.structural.decorator.coffeeExample.decorator;

import com.designpattern.structural.decorator.coffeeExample.component.Coffee;

public abstract class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    public String getDescription(){
        return coffee.getDescription() + " + " +description;
    }
}
