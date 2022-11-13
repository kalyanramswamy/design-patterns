package com.designpattern.creational.abstract_factory.kingdomExample.creator;

import com.designpattern.creational.abstract_factory.kingdomExample.factory.AbstractKingdomFactory;
import com.designpattern.creational.abstract_factory.kingdomExample.factory.ElfKingdomFactory;
import com.designpattern.creational.abstract_factory.kingdomExample.factory.OrcKingdomFactory;
import com.designpattern.creational.abstract_factory.kingdomExample.product.AbstractCastle;
import com.designpattern.creational.abstract_factory.kingdomExample.product.AbstractKing;

public class FactoryKingdomCreator {
    private AbstractKing king;
    private AbstractCastle castle;

    public void createKingdom(final AbstractKingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
    }

    public AbstractKing getKing() {
        return king;
    }

    private void setKing(final AbstractKing king) {
        this.king = king;
    }

    public AbstractCastle getCastle() {
        return castle;
    }

    private void setCastle(final AbstractCastle castle) {
        this.castle = castle;
    }

    public AbstractKingdomFactory getFactory(String kingdom) {
        if(kingdom == null) {
            return null;
        }

        if(kingdom.equalsIgnoreCase("elf")) {
            return new ElfKingdomFactory();
        } else if(kingdom.equalsIgnoreCase("orc")){
            return new OrcKingdomFactory();
        }

        return null;
    }
}
