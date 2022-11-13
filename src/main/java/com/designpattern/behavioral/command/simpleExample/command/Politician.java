package com.designpattern.behavioral.command.simpleExample.command;

public class Politician implements Command {
    public void execute() {
        System.out.println("take money from the rich, take votes from the poor");
    }
}