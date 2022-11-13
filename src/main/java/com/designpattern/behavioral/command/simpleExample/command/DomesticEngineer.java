package com.designpattern.behavioral.command.simpleExample.command;

public class DomesticEngineer implements Command {
    public void execute() {
        System.out.println("take out the trash");
    }
}