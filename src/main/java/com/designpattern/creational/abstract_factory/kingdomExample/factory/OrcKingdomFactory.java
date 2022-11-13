package com.designpattern.creational.abstract_factory.kingdomExample.factory;

import com.designpattern.creational.abstract_factory.kingdomExample.product.AbstractCastle;
import com.designpattern.creational.abstract_factory.kingdomExample.product.AbstractKing;
import com.designpattern.creational.abstract_factory.kingdomExample.product.OrcCastle;
import com.designpattern.creational.abstract_factory.kingdomExample.product.OrcKing;

public class OrcKingdomFactory extends AbstractKingdomFactory {
    @Override
    public AbstractKing createKing() {
        return new OrcKing();
    }

    @Override
    public AbstractCastle createCastle() {
        return new OrcCastle();
    }
}
