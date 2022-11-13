package com.designpattern.creational.abstract_factory.kingdomExample.product;

public class OrcCastle extends AbstractCastle {
    private final String DESCRIPTION = "This is Orcs Castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
