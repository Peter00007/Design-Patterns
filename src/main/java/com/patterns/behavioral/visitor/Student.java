package com.patterns.behavioral.visitor;


public class Student implements Guy{
    @Override
    public void doHomeWork(UkrainianLanguage ukrainianLanguage) {
        System.out.println("Quickly performs tasks with Ukrainian Language");
    }

    @Override
    public void doHomeWork(ForeignLanguage foreignLanguage) {
        System.out.println("Quickly performs tasks with Foreign Language");
    }

    @Override
    public void doHomeWork(Maths maths) {
        System.out.println("Quickly performs tasks with Maths");
    }
}
