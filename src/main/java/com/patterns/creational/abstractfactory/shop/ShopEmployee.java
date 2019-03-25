package com.patterns.creational.abstractfactory.shop;

import com.patterns.creational.abstractfactory.Employee;

public class ShopEmployee implements Employee {
    @Override
    public void performsWork() {
        System.out.println("An employee sells goods at the shop");
    }
}
