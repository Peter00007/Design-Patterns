package com.patterns.structural.decorator;


public class MainSeller extends EmployeeDecorator{
    public MainSeller(Employee employee) {
        super(employee);
    }

    public String sendReview() {
        return "Send review per day. ";
    }

    @Override
    public String makeWork() {
        return super.makeWork() + sendReview();
    }
}
