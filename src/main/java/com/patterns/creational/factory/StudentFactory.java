package com.patterns.creational.factory;


public class StudentFactory implements UniversityStaffFactory{
    @Override
    public Staff createStaff() {
        return new Student();
    }
}
