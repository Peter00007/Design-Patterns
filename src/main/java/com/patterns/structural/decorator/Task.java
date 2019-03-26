package com.patterns.structural.decorator;


public class Task {
    public static void main(String[] args) {
        Employee employee = new MainSeller(new SeniorSeller(new Seller()));

        System.out.println(employee.makeWork());
    }
}
