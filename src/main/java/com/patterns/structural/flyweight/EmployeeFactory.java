package com.patterns.structural.flyweight;


import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static final Map<String, Employee> employees = new HashMap<>();

    public Employee getEmployeeBySpecialty(String specialty) {
        Employee employee = employees.get(specialty);

        if (employee == null) {
            switch (specialty) {
                case "seller":
                    System.out.println("Hiring seller.");
                    employee = new Seller();
                    break;
                case "cashier":
                    System.out.println("Hiring cashier.");
                    employee = new Cashier();
                    break;
            }
            employees.put(specialty, employee);
        }
        return employee;
    }
}
