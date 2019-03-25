package com.patterns.structural.bridge;


public abstract class Work {
    protected Person person;

    protected Work(Person person) {
        this.person = person;
    }

    public abstract void personWorking();
}
