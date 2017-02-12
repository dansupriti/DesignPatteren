package com.sup.practice.creational.builder;

/**
 * Created by ACER on 07-02-2017.
 */
public class TestBuilderPattern {
    public static void main(String args[]){
        User user = new UserBuilder().firstName("Firstname").lastName("Lastname").age(12).build();
        System.out.print(user.toString());
    }
}
