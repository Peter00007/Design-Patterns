package com.patterns.creational.builder;


public class ElectronicServiceBuilder extends ServiceBuilder{
    @Override
    void buildName() {
        service.setName("Laptop");
    }

    @Override
    void buildCms() {
        service.setCms(Cms.ServiceMaintenanceElectronics);
    }

    @Override
    void buildPrice() {
        service.setPrice(200);
    }
}
