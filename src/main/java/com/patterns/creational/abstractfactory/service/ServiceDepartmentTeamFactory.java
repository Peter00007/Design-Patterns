package com.patterns.creational.abstractfactory.service;


import com.patterns.creational.abstractfactory.Employee;
import com.patterns.creational.abstractfactory.Owner;
import com.patterns.creational.abstractfactory.ProjectTeamFactory;
import com.patterns.creational.abstractfactory.Provider;

public class ServiceDepartmentTeamFactory implements ProjectTeamFactory{
    @Override
    public Owner getOwner() {
        return new ServiceDepartmentOwner();
    }

    @Override
    public Employee getEmployee() {
        return new ServiceDepartmentEmployee();
    }

    @Override
    public Provider getProvider() {
        return new ServiceDepartmentProvider();
    }
}
