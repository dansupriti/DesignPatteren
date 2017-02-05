package com.sup.practice.Singleton;

/**
 * Created by ACER on 05-02-2017.
 */
public enum EnumSingletonExample {
    INSTANCE;
    public void doStuff(){
        System.out.println("Singleton using Enum");
    }
}
