package com.patterns.structural.flyweight;


import java.util.ArrayList;
import java.util.List;

public class ShopRunner {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        List<Employee> employee = new ArrayList<>();

        employee.add(employeeFactory.getEmployeeBySpecialty("seller"));
        employee.add(employeeFactory.getEmployeeBySpecialty("seller"));
        employee.add(employeeFactory.getEmployeeBySpecialty("seller"));
        employee.add(employeeFactory.getEmployeeBySpecialty("seller"));
        employee.add(employeeFactory.getEmployeeBySpecialty("seller"));
        employee.add(employeeFactory.getEmployeeBySpecialty("seller"));
        employee.add(employeeFactory.getEmployeeBySpecialty("cashier"));
        employee.add(employeeFactory.getEmployeeBySpecialty("cashier"));
        employee.add(employeeFactory.getEmployeeBySpecialty("cashier"));
        employee.add(employeeFactory.getEmployeeBySpecialty("cashier"));
        employee.add(employeeFactory.getEmployeeBySpecialty("cashier"));
        employee.add(employeeFactory.getEmployeeBySpecialty("cashier"));

        for (Employee employees: employee) {
            employees.doJob();
        }
    }
}
