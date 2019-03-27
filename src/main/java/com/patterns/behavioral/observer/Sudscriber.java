package com.patterns.behavioral.observer;


import java.util.List;

public class Sudscriber implements Observer{
    String name;

    public Sudscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nwe have same changes in vacancies:\n" + vacancies +
        "\n---------------------------------------------------------\n");
    }
}
