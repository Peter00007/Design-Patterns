package com.patterns.creational.singleton;

public class ClassBookRunner {
    public static void main(String[] args) {
        ClassBook.getClassBook().addStudentInfo("Petro Fediuk");
        ClassBook.getClassBook().addStudentInfo("Yura Fischuk");
        ClassBook.getClassBook().addStudentInfo("Andriy Paziuk");

        ClassBook.getClassBook().showInfoFile();
    }
}
