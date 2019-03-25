package com.patterns.creational.abstractfactory.shop;


import com.patterns.creational.abstractfactory.Employee;
import com.patterns.creational.abstractfactory.Owner;
import com.patterns.creational.abstractfactory.ProjectTeamFactory;
import com.patterns.creational.abstractfactory.Provider;

public class ShopTeamFactory implements ProjectTeamFactory {
    @Override
    public Owner getOwner() {
        return new ShopOwner();
    }

    @Override
    public Employee getEmployee() {
        return new ShopEmployee();
    }

    @Override
    public Provider getProvider() {
        return new ShopProvider();
    }
}
