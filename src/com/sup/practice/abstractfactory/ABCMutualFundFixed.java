package com.sup.practice.abstractfactory;

import com.sup.practice.factory.Plan;

/**
 * Created by ACER on 07-02-2017.
 */
public class ABCMutualFundFixed implements FixedPlan{
    private double rate = 10;
    public double getRate(){
        return this.rate;
    }
}
