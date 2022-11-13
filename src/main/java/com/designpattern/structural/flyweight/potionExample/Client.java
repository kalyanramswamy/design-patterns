package com.designpattern.structural.flyweight.potionExample;

import com.designpattern.structural.flyweight.potionExample.enums.PotionType;
import com.designpattern.structural.flyweight.potionExample.factoryMethod.PotionFactory;

public class Client {
    public static void main(String[] args) {
        PotionFactory potionFactory = new PotionFactory();

        potionFactory.createPotion(PotionType.HEALING).drink();
        potionFactory.createPotion(PotionType.INVISIBILITY).drink();
        potionFactory.createPotion(PotionType.HEALING).drink();
        potionFactory.createPotion(PotionType.INVISIBILITY).drink();
    }
}
