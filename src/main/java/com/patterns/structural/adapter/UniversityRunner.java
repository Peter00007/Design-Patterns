package com.patterns.structural.adapter;


public class UniversityRunner {
    public static void main(String[] args) {
        University university= new AdapterSchoolToUniversity();

        university.rector();
        university.headDepartment();
        university.lecturer();
        university.student();
    }
}
