package com.sup.practice.abstractfactory;

import com.sup.practice.factory.Plan;

/**
 * Created by ACER on 07-02-2017.
 */
public class MNOMutualFundFixed implements FixedPlan{
    private double rate = 20;
    public double getRate(){
        return this.rate;
    }
}
