package com.patterns.structural.composite;


public class Supplier implements Employee{
    @Override
    public void doSomething() {
        System.out.println("The supplier supplies the goods");
    }
}
