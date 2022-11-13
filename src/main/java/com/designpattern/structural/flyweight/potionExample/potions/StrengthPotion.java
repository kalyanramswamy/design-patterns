package com.designpattern.structural.flyweight.potionExample.potions;

public class StrengthPotion implements Potion {

  @Override
  public void drink() {
    System.out.println("You feel strong. " + System.identityHashCode(this));
  }
}