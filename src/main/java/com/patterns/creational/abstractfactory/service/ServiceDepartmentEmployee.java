package com.patterns.creational.abstractfactory.service;


import com.patterns.creational.abstractfactory.Employee;

public class ServiceDepartmentEmployee implements Employee{
    @Override
    public void performsWork() {
        System.out.println("Employee in this service department");
    }
}
