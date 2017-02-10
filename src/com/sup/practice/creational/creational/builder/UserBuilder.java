package com.sup.practice.creational.creational.builder;

/**
 * Created by ACER on 07-02-2017.
 */
public class UserBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    public UserBuilder(){}

    public User build(){
        return new User(this.firstName, this.lastName, this.age, this.phone, this.address);
    }

    public UserBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

}
