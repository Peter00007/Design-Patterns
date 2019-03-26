package com.patterns.structural.flyweight;


public class Seller implements Employee{
    @Override
    public void doJob() {
        System.out.println("Sells the product.");
    }
}
