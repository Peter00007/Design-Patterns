package com.patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Junior Java Developer");
        jobSite.addVacancy("Middle Java Developer");

        Observer firstObserver = new Sudscriber("Peter");
        Observer secondObserver = new Sudscriber("Vasya");

        jobSite.addObserved(firstObserver);
        jobSite.addObserved(secondObserver);

        jobSite.removeVacancy("Junior Java Developer");
    }
}
