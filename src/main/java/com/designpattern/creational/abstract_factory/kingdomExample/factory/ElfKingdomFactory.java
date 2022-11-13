package com.designpattern.creational.abstract_factory.kingdomExample.factory;

import com.designpattern.creational.abstract_factory.kingdomExample.product.AbstractCastle;
import com.designpattern.creational.abstract_factory.kingdomExample.product.AbstractKing;
import com.designpattern.creational.abstract_factory.kingdomExample.product.ElfCastle;
import com.designpattern.creational.abstract_factory.kingdomExample.product.ElfKing;

public class ElfKingdomFactory extends AbstractKingdomFactory {
    @Override
    public AbstractKing createKing() {
        return new ElfKing();
    }

    @Override
    public AbstractCastle createCastle() {
        return new ElfCastle();
    }
}
