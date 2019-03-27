package com.patterns.behavioral.strategy;


public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();

        student.setActivity(new Sleeping());
        student.executeActivity();

        student.setActivity(new Eating());
        student.executeActivity();

        student.setActivity(new Studying());
        student.executeActivity();

        student.setActivity(new Eating());
        student.executeActivity();

        student.setActivity(new Training());
        student.executeActivity();

        student.setActivity(new Eating());
        student.executeActivity();

        student.setActivity(new Sleeping());
        student.executeActivity();
    }
}
