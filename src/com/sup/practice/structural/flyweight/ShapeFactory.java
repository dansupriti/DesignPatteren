package com.sup.practice.structural.flyweight;

import java.util.HashMap;

/**
 * Created by ACER on 12-02-2017.
 */
public class ShapeFactory {
    private static final HashMap shapes = new HashMap();

    public static MyShape getShape(String label) {
        MyShape concreteShape = (MyShape) shapes.get(label);

        if (concreteShape == null) {
            if (label.equals("R")) {
                concreteShape = new MyRectangle(label);
            } else if (label.equals("O")) {
                concreteShape = new MyOval(label);
            }
            shapes.put(label, concreteShape);
        }
        return concreteShape;
    }
}
