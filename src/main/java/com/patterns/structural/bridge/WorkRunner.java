package com.patterns.structural.bridge;

public class WorkRunner {
    public static void main(String[] args) {
        Work work[] = {
                new Service(new Employee()),
                new Shop(new Employee())
        };

        for (Work working: work) {
            working.personWorking();
        }
    }
}
