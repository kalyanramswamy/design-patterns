package com.designpattern.behavioral.command.simpleExample.command;

public class Programmer implements Command {
    public void execute() {
        System.out.println("sell the bugs, charge extra for the fixes");
    }
}