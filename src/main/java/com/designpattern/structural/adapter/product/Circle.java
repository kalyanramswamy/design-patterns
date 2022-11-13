package com.designpattern.structural.adapter.product;

public class Circle extends AbstractShape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
    @Override
    public void resize() {
        System.out.println("Resizing Circle");
    }
    @Override
    public String description() {
        return "Circle object";
    }
}
