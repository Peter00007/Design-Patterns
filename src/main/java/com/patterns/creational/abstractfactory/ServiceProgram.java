package com.patterns.creational.abstractfactory;


import com.patterns.creational.abstractfactory.shop.ShopTeamFactory;

public class ServiceProgram {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new ShopTeamFactory();

        Owner owner = projectTeamFactory.getOwner();
        Employee employee = projectTeamFactory.getEmployee();
        Provider provider = projectTeamFactory.getProvider();

        System.out.println("Create shop process...");
        owner.managesProcess();
        employee.performsWork();
        provider.suppliesGoods();
    }
}
