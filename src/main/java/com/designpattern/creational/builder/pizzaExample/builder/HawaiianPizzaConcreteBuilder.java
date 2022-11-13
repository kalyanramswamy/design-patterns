package com.designpattern.creational.builder.pizzaExample.builder;

/* "ConcreteBuilder" */
public class HawaiianPizzaConcreteBuilder extends PizzaAbstractBuilder {

    @Override
    public void buildDough() {
        pizzaProduct.setDough("cross");
    }

    @Override
    public void buildSauce() {
        pizzaProduct.setSauce("mild");
    }

    @Override
    public void buildTopping() {
        pizzaProduct.setTopping("ham+pineapple");
    }
}
