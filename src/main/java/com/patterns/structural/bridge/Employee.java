package com.patterns.structural.bridge;


public class Employee implements Person{
    @Override
    public void doSomething() {
        System.out.println("Employee does some work...");
    }
}
