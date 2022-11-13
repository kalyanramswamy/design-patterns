package com.designpattern.behavioral.command.simpleExample.command;

public interface Command {
    public void execute();class DomesticEngineer implements Command {
        public void execute() {
            System.out.println("take out the trash");
        }
    }
}
