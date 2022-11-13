package com.designpattern.creational.abstract_factory.kingdomExample.factory;

import com.designpattern.creational.abstract_factory.kingdomExample.product.AbstractCastle;
import com.designpattern.creational.abstract_factory.kingdomExample.product.AbstractKing;

public abstract class AbstractKingdomFactory {
    public abstract AbstractKing createKing();
    public abstract AbstractCastle createCastle();
}
