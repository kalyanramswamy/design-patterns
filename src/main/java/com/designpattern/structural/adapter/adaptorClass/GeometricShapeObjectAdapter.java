package com.designpattern.structural.adapter.adaptorClass;

import com.designpattern.structural.adapter.adaptProduct.GeometricShape;
import com.designpattern.structural.adapter.adaptProduct.Rhombus;
import com.designpattern.structural.adapter.adaptProduct.Triangle;
import com.designpattern.structural.adapter.product.AbstractShape;

public class GeometricShapeObjectAdapter extends AbstractShape {

    private GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "Triangle object";
        } else if (adaptee instanceof Rhombus) {
            return "Rhombus object";
        } else {
            return "Unknown object";
        }
    }
}
