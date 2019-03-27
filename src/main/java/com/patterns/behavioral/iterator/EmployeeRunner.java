package com.patterns.behavioral.iterator;


public class EmployeeRunner {
    public static void main(String[] args) {
        String[] skils = {"Honest", "Responsible", "Intelligent"};

        Employee employee = new Employee("Petro Fediuk", skils);

        Iterator iterator = employee.getIterator();
        System.out.println("Employee: " + employee.getName());
        System.out.println("Skills:");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
