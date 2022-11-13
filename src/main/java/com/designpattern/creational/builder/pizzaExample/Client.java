package com.designpattern.creational.builder.pizzaExample;

import com.designpattern.creational.builder.pizzaExample.builder.HawaiianPizzaConcreteBuilder;
import com.designpattern.creational.builder.pizzaExample.builder.PizzaAbstractBuilder;
import com.designpattern.creational.builder.pizzaExample.builder.SpicyPizzaConcreteBuilder;
import com.designpattern.creational.builder.pizzaExample.director.Cook;
import com.designpattern.creational.builder.pizzaExample.product.Pizza;

public class Client {
    public static void main(String[] args) {
        Cook director = new Cook();

        PizzaAbstractBuilder hawaiianPizzaBuilder = new HawaiianPizzaConcreteBuilder();
        PizzaAbstractBuilder spicyPizzaBuilder = new SpicyPizzaConcreteBuilder();

        director.setPizzaBuilder(hawaiianPizzaBuilder);
        director.constructPizza();
        Pizza hawaiianPizzaProduct = director.getPizza();
        System.out.println(hawaiianPizzaProduct);

        director.setPizzaBuilder(spicyPizzaBuilder);
        director.constructPizza();
        Pizza spicyPizzaProduct = director.getPizza();
        System.out.println(spicyPizzaProduct);
    }
}
