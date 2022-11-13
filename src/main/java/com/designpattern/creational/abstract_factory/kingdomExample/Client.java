package com.designpattern.creational.abstract_factory.kingdomExample;

import com.designpattern.creational.abstract_factory.kingdomExample.creator.FactoryKingdomCreator;
import com.designpattern.creational.abstract_factory.kingdomExample.factory.AbstractKingdomFactory;

public class Client {

    public static void main(String[] args) {

        System.out.println("Elf Kingdom");
        FactoryKingdomCreator factoryCreator = new FactoryKingdomCreator();
        AbstractKingdomFactory orcKingdomFactory = factoryCreator.getFactory("orc");
        factoryCreator.createKingdom(orcKingdomFactory);

        System.out.println(factoryCreator.getKing().getDescription());
        System.out.println(factoryCreator.getCastle().getDescription());
    }
}
