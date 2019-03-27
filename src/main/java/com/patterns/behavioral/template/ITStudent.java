package com.patterns.behavioral.template;


public class ITStudent extends ScheduleTemplate{
    @Override
    public void showWork() {
        System.out.println("Coding");
    }
}
