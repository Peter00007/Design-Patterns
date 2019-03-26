package com.patterns.structural.composite;


public class Seller implements Employee {
    @Override
    public void doSomething() {
        System.out.println("The seller calculates the value of the goods");
    }
}
