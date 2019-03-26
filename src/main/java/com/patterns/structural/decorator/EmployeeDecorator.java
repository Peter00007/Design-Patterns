package com.patterns.structural.decorator;


public class EmployeeDecorator implements Employee{

    Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String makeWork() {
        return employee.makeWork();
    }
}
