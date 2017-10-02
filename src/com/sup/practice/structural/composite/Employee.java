package com.sup.practice.structural.composite;

/**
 * Created by ACER on 12-02-2017.
 */
public interface Employee {
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
    public String getName();
    public double getSalary();
    public void print();
}
