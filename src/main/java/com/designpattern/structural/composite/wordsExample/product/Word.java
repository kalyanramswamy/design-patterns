package com.designpattern.structural.composite.wordsExample.product;

import com.designpattern.structural.composite.wordsExample.composite.LetterComposite;

import java.util.List;

public class Word extends LetterComposite {

  public Word(List<Letter> letters) {
    letters.forEach(this::add);
  }

  public Word(char... letters) {
    for (char letter : letters) {
      this.add(new Letter(letter));
    }
  }

  @Override
  protected void printThisBefore() {
    System.out.print(" ");
  }
}