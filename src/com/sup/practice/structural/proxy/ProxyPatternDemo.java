package com.sup.practice.structural.proxy;

/**
 * Created by ACER on 12-02-2017.
 */
public class ProxyPatternDemo {
    public static void main(String args[]){
        Image image = new ProxyImage("testFile.pdf");
        image.display();
        image.display();
    }
}
