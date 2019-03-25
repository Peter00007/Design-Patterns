package com.patterns.creational.prototype;


public class StudentData implements Copyable{
    private int numberInList;
    private String firstName;
    private String lastName;

    public StudentData(int numberInList, String firstName, String lastName) {
        this.numberInList = numberInList;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getNumberInList() {
        return numberInList;
    }

    public void setNumberInList(int numberInList) {
        this.numberInList = numberInList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Object copy() {
        StudentData copy = new StudentData(numberInList, firstName, lastName);
        return copy;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "numberInList=" + numberInList +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
