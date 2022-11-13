package com.designpattern.structural.adapter.client;

import com.designpattern.structural.adapter.adaptProduct.Rhombus;
import com.designpattern.structural.adapter.adaptProduct.Triangle;
import com.designpattern.structural.adapter.adaptorClass.GeometricShapeObjectAdapter;
import com.designpattern.structural.adapter.product.Circle;
import com.designpattern.structural.adapter.product.Rectangle;

public class Client {

    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        /*
            Abstract classes - 1. AbstractShape 2. GeometricShape

            lets say, GeometricShape was created by some other team or 3rd party class
            and you want classes of GeometricShape to be adapted to AbstractShape to reuse Drawing class

            for this we need to create adapter class which can help GeometricShape class object to adapt AbstractShape

            Adapter Class - GeometricShapeObjectAdapter
        */

        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));

        drawing.draw();
        drawing.resize();
    }
}
