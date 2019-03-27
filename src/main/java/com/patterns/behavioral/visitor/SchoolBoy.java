package com.patterns.behavioral.visitor;


public class SchoolBoy implements Guy{
    @Override
    public void doHomeWork(UkrainianLanguage ukrainianLanguage) {
        System.out.println("For a long time, it is carrying out tasks with Ukrainian Language");
    }

    @Override
    public void doHomeWork(ForeignLanguage foreignLanguage) {
        System.out.println("For a long time, it is carrying out tasks with Foreign Language");
    }

    @Override
    public void doHomeWork(Maths maths) {
        System.out.println("For a long time, it is carrying out tasks with Maths");
    }
}
