package com.designpattern.creational.abstract_factory.kingdomExample.product;

public class ElfKing extends AbstractKing {
    private final String DESCRIPTION = "This is the Elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
