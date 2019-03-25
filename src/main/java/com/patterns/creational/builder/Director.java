package com.patterns.creational.builder;


public class Director {
    ServiceBuilder builder;

    public void setBuilder(ServiceBuilder builder) {
        this.builder = builder;
    }

    Service builderService() {
        builder.createService();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Service service = builder.getService();

        return service;
    }
}
