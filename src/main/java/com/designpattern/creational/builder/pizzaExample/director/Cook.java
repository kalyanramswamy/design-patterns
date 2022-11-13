package com.designpattern.creational.builder.pizzaExample.director;

import com.designpattern.creational.builder.pizzaExample.builder.PizzaAbstractBuilder;
import com.designpattern.creational.builder.pizzaExample.product.Pizza;

/* Director */
public class Cook {
    private PizzaAbstractBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaAbstractBuilder builder) {
        this.pizzaBuilder = builder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizzaProduct();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
