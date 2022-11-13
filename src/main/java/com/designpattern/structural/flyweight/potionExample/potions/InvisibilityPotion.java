package com.designpattern.structural.flyweight.potionExample.potions;

public class InvisibilityPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You become invisible. " + System.identityHashCode(this));
    }
}
