package com.designpattern.structural.adapter.product;

public class Rectangle extends AbstractShape {

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
    @Override
    public void resize() {
        System.out.println("Resizing Rectangle");
    }
    @Override
    public String description() {
        return "Rectangle object";
    }
}
