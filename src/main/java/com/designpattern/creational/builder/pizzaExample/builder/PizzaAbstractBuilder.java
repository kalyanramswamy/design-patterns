package com.designpattern.creational.builder.pizzaExample.builder;

import com.designpattern.creational.builder.pizzaExample.product.Pizza;

/* "Abstract Builder" */
public abstract class PizzaAbstractBuilder {
    protected Pizza pizzaProduct;

    public Pizza getPizzaProduct() {
        return pizzaProduct;
    }

    public void createNewPizzaProduct() {
        pizzaProduct = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
