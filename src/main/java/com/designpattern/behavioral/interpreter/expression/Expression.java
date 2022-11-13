package com.designpattern.behavioral.interpreter.expression;

public abstract class Expression {
    public abstract int interpret();

    @Override
    public abstract String toString();
}
