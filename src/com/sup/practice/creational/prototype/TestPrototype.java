package com.sup.practice.creational.prototype;

/**
 * Created by ACER on 08-02-2017.
 */
public class TestPrototype {
    public static void main(String args[]){
        ShapeCache.loadShapeCache();

        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape type is :: " + cloneShape.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape type is :: " + cloneShape2.getType());

        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("Shape type is :: " + cloneShape3.getType());
    }
}
