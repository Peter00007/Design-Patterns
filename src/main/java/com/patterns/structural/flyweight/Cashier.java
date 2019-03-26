package com.patterns.structural.flyweight;


public class Cashier implements Employee{
    @Override
    public void doJob() {
        System.out.println("Calculates the value of the goods");
    }
}
