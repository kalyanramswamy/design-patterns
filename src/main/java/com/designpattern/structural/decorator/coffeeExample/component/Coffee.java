package com.designpattern.structural.decorator.coffeeExample.component;

public abstract class Coffee {
    protected String description;

    public String getDescription(){
        return description;
    }

    public abstract float getCost();
}
