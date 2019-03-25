package com.patterns.structural.bridge;


public class Provider implements Person{
    @Override
    public void doSomething() {
        System.out.println("Provides goods...");
    }
}
