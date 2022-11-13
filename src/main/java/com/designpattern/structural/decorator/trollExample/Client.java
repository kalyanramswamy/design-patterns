package com.designpattern.structural.decorator.trollExample;

import com.designpattern.structural.decorator.trollExample.component.SimpleTroll;
import com.designpattern.structural.decorator.trollExample.component.Troll;
import com.designpattern.structural.decorator.trollExample.decorator.ClubbedTroll;

public class Client {
    public static void main(String[] args) {
        System.out.println("A simple looking troll approaches.");
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Simple troll power {}.\n" + troll.getAttackPower());

        // change the behavior of the simple troll by adding a decorator
        System.out.println("A troll with huge club surprises you.");
        Troll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("Clubbed troll power {}.\n" + clubbedTroll.getAttackPower());
    }
}
