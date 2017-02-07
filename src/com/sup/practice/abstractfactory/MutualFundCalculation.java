package com.sup.practice.abstractfactory;

import com.sup.practice.factory.Plan;
import com.sup.practice.factory.PlanFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ACER on 07-02-2017.
 */
public class MutualFundCalculation {
    public static void main(String args[]) throws IOException{

        AbstractPlanFactory abstractPlanFactory = AbstractFactoryCreator.getAbstractPlanFactory("fixed");

        FixedPlan fixedPlantype = abstractPlanFactory.getFixedPlan("xyz");

        System.out.print("In " + "abc" + " plan for " + "10" + " units rate will be ::");
        fixedPlantype.calculatePlan(fixedPlantype.getRate(), 10);

        AbstractPlanFactory abstractPlanFactory1 = AbstractFactoryCreator.getAbstractPlanFactory("sip");

        SIPPlan fixedPlantype1 = abstractPlanFactory1.getSIPPlan("xyz");

        System.out.print("In " + "abc" + " plan for " + "10" + " units rate will be ::");
        fixedPlantype1.calculatePlan(fixedPlantype1.getRate(), 10);

    }
}
