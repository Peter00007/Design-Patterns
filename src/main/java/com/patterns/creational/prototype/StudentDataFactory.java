package com.patterns.creational.prototype;


public class StudentDataFactory {
    StudentData studentData;

    public StudentDataFactory(StudentData studentData) {
        this.studentData = studentData;
    }

    public void setStudentData(StudentData studentData) {
        this.studentData = studentData;
    }

    StudentData cloneData() {
        return (StudentData) studentData.copy();
    }
}
