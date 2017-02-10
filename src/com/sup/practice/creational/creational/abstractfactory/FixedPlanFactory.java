package com.sup.practice.creational.creational.abstractfactory;

/**
 * Created by ACER on 07-02-2017.
 */
public class FixedPlanFactory implements AbstractPlanFactory{
    public FixedPlan getFixedPlan(String planName){

            if (planName == null) {
                System.out.print("No PlanFactory found for this given planType");
            }
            if (planName.equalsIgnoreCase("ABC")) {
                return new ABCMutualFundFixed();
            } else if (planName.equalsIgnoreCase("XYZ")) {
                return new XYZMutualFundFixed();
            } else {
                return new MNOMutualFundFixed();
            }

    }
    public SIPPlan getSIPPlan(String planName){
        return null;
    }
}
