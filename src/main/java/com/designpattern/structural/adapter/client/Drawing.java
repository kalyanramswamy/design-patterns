package com.designpattern.structural.adapter.client;

import com.designpattern.structural.adapter.product.AbstractShape;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

    List<AbstractShape> shapes = new ArrayList<>();

    public Drawing() {
        super();
    }

    public void addShape(AbstractShape shape) {
        shapes.add(shape);
    }

    public List<AbstractShape> getShapes() {
        return new ArrayList<AbstractShape>(shapes);
    }

    public void draw() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to draw!");
        } else {
            shapes.stream().forEach(shape -> shape.draw());
        }
    }

    public void resize() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to resize!");
        } else {
            shapes.stream().forEach(shape -> shape.resize());
        }
    }
}
