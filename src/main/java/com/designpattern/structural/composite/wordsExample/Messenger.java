package com.designpattern.structural.composite.wordsExample;

import com.designpattern.structural.composite.wordsExample.composite.LetterComposite;
import com.designpattern.structural.composite.wordsExample.product.Sentence;
import com.designpattern.structural.composite.wordsExample.product.Word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Messenger {

  LetterComposite messageFromOrcs() {

    List<Word> words = new ArrayList<>();
    words.add(new Word('W', 'h', 'e', 'r', 'e'));
    words.add(new Word('t', 'h', 'e', 'r', 'e'));
    words.add(new Word('i', 's'));
    words.add(new Word('a'));
    words.add(new Word('w', 'h', 'i', 'p'));
    words.add(new Word('t', 'h', 'e', 'r', 'e'));
    words.add(new Word('i', 's'));
    words.add(new Word('a'));
    words.add(new Word('w', 'a', 'y'));

    return new Sentence(words);

  }

  LetterComposite messageFromElves() {

    List<Word> words = Arrays.asList(new Word[]{
        new Word('M', 'u', 'c', 'h'),
        new Word('w', 'i', 'n', 'd'),
        new Word('p', 'o', 'u', 'r', 's'),
        new Word('f', 'r', 'o', 'm'),
        new Word('y', 'o', 'u', 'r'),
        new Word('m', 'o', 'u', 't', 'h')});

    return new Sentence(words);

  }

}