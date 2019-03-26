package com.patterns.structural.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Develoepr is solving problems.");
        } else {
            System.out.println("Developer relaxing.");
        }
    }
}
