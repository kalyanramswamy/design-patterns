package com.designpattern.creational.builder.pizzaExample.builder;

/* Concrete builder */
public class SpicyPizzaConcreteBuilder extends PizzaAbstractBuilder {
    @Override
    public void buildDough() {
        pizzaProduct.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizzaProduct.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizzaProduct.setTopping("pepperoni+salami");
    }
}
