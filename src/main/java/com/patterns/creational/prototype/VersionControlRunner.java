package com.patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        StudentData studentData = new StudentData(1, "Petro", "Fediuk");

        System.out.println(studentData);

        StudentDataFactory studentDataFactory = new StudentDataFactory(studentData);
        StudentData clone = studentDataFactory.cloneData();

        System.out.println("\n------------------------------------------------------------------------\n");

        System.out.println(clone);
    }
}
