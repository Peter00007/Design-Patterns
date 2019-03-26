package com.patterns.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void createTeam() {
        System.out.println("Team:\n\n");
        for (Employee employee: employees) {
            employee.doSomething();
        }
    }
}
