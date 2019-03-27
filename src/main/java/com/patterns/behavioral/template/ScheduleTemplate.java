package com.patterns.behavioral.template;

/**
 * Created by User on 27.03.2019.
 */
public abstract class ScheduleTemplate {
    public void showSchedule() {
        System.out.println("Sleeping");
        System.out.println("Eating");
        System.out.println("Studying");
        System.out.println("Relaxing");
        showWork();
        System.out.println("Eating");
        System.out.println("Sleeping");
    }

    public abstract void showWork();
}
