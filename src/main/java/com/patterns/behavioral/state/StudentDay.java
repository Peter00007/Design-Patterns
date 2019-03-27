package com.patterns.behavioral.state;


public class StudentDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();

        Student student = new Student();

        student.setActivity(activity);

        for (int i = 0; i < 12; i++) {
            student.justDoIt();
            student.changeActivity();
        }
    }
}
