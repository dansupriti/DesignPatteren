package com.sup.practice.creational.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ACER on 07-02-2017.
 */
public class MutualFundCalculation {
    public static void main(String args[]) throws IOException{
        PlanFactory planFactory = new PlanFactory();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String planType = bufferedReader.readLine();
        int numberOfUnits = Integer.parseInt(bufferedReader.readLine());

        Plan planOfGivenType = planFactory.getPlan(planType);

        System.out.print("In " + planType + " plan for " + numberOfUnits + " units rate will be ::");
        planOfGivenType.calculatePlan(planOfGivenType.getRate(), numberOfUnits);

    }
}
