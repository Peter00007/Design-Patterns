package com.patterns.creational.factory;

/**
 * Created by User on 25.03.2019.
 */
public class TeacherFactory implements UniversityStaffFactory{
    @Override
    public Staff createStaff() {
        return new Teacher();
    }
}
