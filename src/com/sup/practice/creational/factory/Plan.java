package com.sup.practice.creational.factory;

/**
 * Created by ACER on 07-02-2017.
 */
public interface Plan {
    public double getRate();
    default public void calculatePlan(double rate, int units){
        System.out.println(rate * units);
    }
}
