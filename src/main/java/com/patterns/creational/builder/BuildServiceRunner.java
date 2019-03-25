package com.patterns.creational.builder;


public class BuildServiceRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new ElectronicServiceBuilder());
        Service service = director.builderService();

        System.out.println(service);
    }
}
