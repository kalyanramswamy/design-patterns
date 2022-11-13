package com.designpattern.creational.abstract_factory.kingdomExample.product;

public class OrcKing extends AbstractKing {
    private final String DESCRIPTION = "This is Orcs King!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
