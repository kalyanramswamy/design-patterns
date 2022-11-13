package com.designpattern.structural.decorator.coffeeExample;

import com.designpattern.structural.decorator.coffeeExample.component.Coffee;
import com.designpattern.structural.decorator.coffeeExample.concreteComponent.Latte;
import com.designpattern.structural.decorator.coffeeExample.concreteDecorator.Chocolate;
import com.designpattern.structural.decorator.coffeeExample.concreteDecorator.Milk;

public class Client {
    public static void main(String[] args) {
        Coffee latteCoffee = new Latte();

        // add decorations
        Coffee firstChocolateLatteCoffee = new Chocolate(latteCoffee);
        Coffee secondChocolateLatteCoffee = new Chocolate(firstChocolateLatteCoffee);

        Coffee extraMilkChocolateLatteCoffee = new Milk(secondChocolateLatteCoffee);

        System.out.println("Description: " + extraMilkChocolateLatteCoffee.getDescription());
        System.out.println("Cost: " + extraMilkChocolateLatteCoffee.getCost());
    }
}
