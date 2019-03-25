package com.patterns.creational.abstractfactory.service;

import com.patterns.creational.abstractfactory.Owner;

public class ServiceDepartmentOwner implements Owner{
    @Override
    public void managesProcess() {
        System.out.println("Owner this service department");
    }
}
