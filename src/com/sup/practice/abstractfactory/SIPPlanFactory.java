package com.sup.practice.abstractfactory;

/**
 * Created by ACER on 07-02-2017.
 */
public class SIPPlanFactory implements AbstractPlanFactory{
    public FixedPlan getFixedPlan(String planName) {
        return null;
    }

    public SIPPlan getSIPPlan(String planName) {
        if (planName == null) {
            System.out.print("No PlanFactory found for this given planType");
        }
        if (planName.equalsIgnoreCase("ABC")) {
            return new ABCMutualFundSIP();
        } else if (planName.equalsIgnoreCase("XYZ")) {
            return new XYZMutualFundSIP();
        } else {
            return new MNOMutualFundSIP();
        }
    }
}
