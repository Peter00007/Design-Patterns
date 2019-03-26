package com.patterns.structural.decorator;


public class SeniorSeller extends EmployeeDecorator{

    public SeniorSeller(Employee employee) {
        super(employee);
    }

    public String calculates() {
        return "Calculates the amount of goods. ";
    }

    @Override
    public String makeWork() {
        return super.makeWork() + calculates();
    }
}
