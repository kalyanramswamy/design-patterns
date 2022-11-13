package com.designpattern.structural.composite.wordsExample.product;

import com.designpattern.structural.composite.wordsExample.composite.LetterComposite;

public class Letter extends LetterComposite {
    private char character;

    public Letter(char c) {
        this.character = c;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(character);
    }
}
