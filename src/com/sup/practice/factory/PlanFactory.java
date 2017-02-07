package com.sup.practice.factory;

/**
 * Created by ACER on 07-02-2017.
 */
public class PlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            System.out.print("No PlanFactory found for this given planType");
        }
        if (planType.equalsIgnoreCase("ABC")) {
            return new ABCMutualFund();
        } else if (planType.equalsIgnoreCase("XYZ")) {
            return new XYZMutualFund();
        } else {
            return new MNOMutualFund();
        }
    }
}
