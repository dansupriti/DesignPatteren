package com.sup.practice.abstractfactory;

import com.sup.practice.factory.Plan;

/**
 * Created by ACER on 07-02-2017.
 */
public class XYZMutualFundFixed implements FixedPlan{
    private double rate = 30;
    public double getRate(){
        return this.rate;
    }
}
