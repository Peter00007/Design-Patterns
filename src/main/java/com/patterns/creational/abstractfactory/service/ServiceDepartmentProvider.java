package com.patterns.creational.abstractfactory.service;

import com.patterns.creational.abstractfactory.Provider;


public class ServiceDepartmentProvider implements Provider{
    @Override
    public void suppliesGoods() {
        System.out.println("The supplier supplies spare parts for this service");
    }
}
