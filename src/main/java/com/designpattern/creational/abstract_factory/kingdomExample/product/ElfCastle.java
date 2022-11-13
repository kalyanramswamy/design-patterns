package com.designpattern.creational.abstract_factory.kingdomExample.product;

public class ElfCastle extends AbstractCastle {
    private final String DESCRIPTION = "This is the Elven Castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
