package com.sup.practice.abstractfactory;

/**
 * Created by ACER on 07-02-2017.
 */
public interface AbstractPlanFactory {
    public FixedPlan getFixedPlan(String planName);
    public SIPPlan getSIPPlan(String planName);
}
