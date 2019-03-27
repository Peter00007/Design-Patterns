package com.patterns.behavioral.visitor;

public class HomeWorkRunner {
    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork();

        Guy schoolBoy = new SchoolBoy();
        Guy student = new Student();

        System.out.println("Studying schoolBoy");
        homeWork.beStudying(schoolBoy);

        System.out.println("\n--------------------------------------------------------------------\n");

        System.out.println("Studying student");
        homeWork.beStudying(student);
    }
}
