package com.sup.practice.abstractfactory;

/**
 * Created by ACER on 07-02-2017.
 */
public interface PlanFactory {
    public double getRate();
    default public void calculatePlan(double rate, int units){
        System.out.println(rate * units);
    }
}
