package com.patterns.creational.factory;


public class Program {
    public static void main(String[] args) {
        UniversityStaffFactory universityStaffFactory = createUniversityStaffFactoryBySpecialty("teachers");
        Staff universityStaff = universityStaffFactory.createStaff();
        universityStaff.writeActivity();
    }

    static UniversityStaffFactory createUniversityStaffFactoryBySpecialty (String specialty) {
        if (specialty.equalsIgnoreCase("students")) {
            return new StudentFactory();
        }
        if (specialty.equalsIgnoreCase("teachers")) {
            return new TeacherFactory();
        }
        else {
            throw new RuntimeException(specialty + " is unknown");
        }
    }
}
