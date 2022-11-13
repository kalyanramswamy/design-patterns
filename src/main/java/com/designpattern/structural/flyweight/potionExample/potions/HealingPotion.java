package com.designpattern.structural.flyweight.potionExample.potions;

public class HealingPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You feel healed. " + System.identityHashCode(this));
    }
}
