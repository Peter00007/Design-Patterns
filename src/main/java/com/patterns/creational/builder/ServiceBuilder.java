package com.patterns.creational.builder;

public abstract class ServiceBuilder {
    Service service;

    void createService() {
        service = new Service();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Service getService() {
        return service;
    }
}
