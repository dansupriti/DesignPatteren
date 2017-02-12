package com.sup.practice.creational.structural.adapter.facade;

/**
 * Created by ACER on 12-02-2017.
 */
public class FacadePatternDemo {
    public static void main(String args[]){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
