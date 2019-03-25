package com.patterns.creational.factory;

/**
 * Created by User on 25.03.2019.
 */
public class Teacher implements Staff{
    @Override
    public void writeActivity() {
        System.out.println("Teachers teach");
    }
}
