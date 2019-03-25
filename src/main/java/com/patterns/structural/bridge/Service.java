package com.patterns.structural.bridge;


public class Service extends Work{

    protected Service(Person person) {
        super(person);
    }

    @Override
    public void personWorking() {
        System.out.println("Work on the service continues...");
        person.doSomething();
    }
}
