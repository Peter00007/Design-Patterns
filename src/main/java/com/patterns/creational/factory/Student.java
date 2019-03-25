package com.patterns.creational.factory;


public class Student implements Staff{
    @Override
    public void writeActivity() {
        System.out.println("Students are studying");
    }
}
