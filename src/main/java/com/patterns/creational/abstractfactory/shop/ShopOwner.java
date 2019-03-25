package com.patterns.creational.abstractfactory.shop;

import com.patterns.creational.abstractfactory.Owner;

public class ShopOwner implements Owner{
    @Override
    public void managesProcess() {
        System.out.println("The owner manages the process in the shop");
    }
}
