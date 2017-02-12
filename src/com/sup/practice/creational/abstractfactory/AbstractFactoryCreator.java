package com.sup.practice.creational.abstractfactory;

/**
 * Created by ACER on 07-02-2017.
 */
public class AbstractFactoryCreator {
    public static AbstractPlanFactory getAbstractPlanFactory(String choice){
        if(choice.equalsIgnoreCase("fixed")){
            return new FixedPlanFactory();
        }
        else if(choice.equalsIgnoreCase("sip")){
            return new SIPPlanFactory();
        }
        return null;
    }
}
