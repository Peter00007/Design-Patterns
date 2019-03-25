package com.patterns.creational.builder;

public class AutoServiceBuilder extends ServiceBuilder{
    @Override
    void buildName() {
        service.setName("Mercedes");
    }

    @Override
    void buildCms() {
        service.setCms(Cms.CarServiceMaintenance);
    }

    @Override
    void buildPrice() {
        service.setPrice(1500);
    }
}
