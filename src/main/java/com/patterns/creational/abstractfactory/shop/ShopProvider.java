package com.patterns.creational.abstractfactory.shop;

import com.patterns.creational.abstractfactory.Provider;

public class ShopProvider implements Provider {
    @Override
    public void suppliesGoods() {
        System.out.println("The supplier supplies the products to the shop");
    }
}
