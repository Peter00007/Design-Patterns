package com.patterns.behavioral.template;


public class GuysRunner {
    public static void main(String[] args) {
        ScheduleTemplate itStudent = new ITStudent();
        ScheduleTemplate sportsmanStudent = new SportsmanStudent();

        itStudent.showSchedule();
        System.out.println("\n--------------------\n");
        sportsmanStudent.showSchedule();
    }
}
