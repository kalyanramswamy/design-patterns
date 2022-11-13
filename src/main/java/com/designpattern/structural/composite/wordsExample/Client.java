package com.designpattern.structural.composite.wordsExample;

import com.designpattern.structural.composite.wordsExample.composite.LetterComposite;

public class Client {

    public static void main(String[] args) {
        System.out.println("Message from the orcs: ");

        LetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        System.out.println("\nMessage from the elves: ");

        LetterComposite elfMessage = new Messenger().messageFromElves();
        elfMessage.print();
    }
}
