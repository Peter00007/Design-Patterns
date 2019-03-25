package com.patterns.structural.bridge;


public class Shop extends Work{

    protected Shop(Person person) {
        super(person);
    }

    @Override
    public void personWorking() {
        System.out.println("Work in the shop continues...");
        person.doSomething();
    }
}
