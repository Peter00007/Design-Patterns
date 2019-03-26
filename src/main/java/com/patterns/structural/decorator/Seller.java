package com.patterns.structural.decorator;


public class Seller implements Employee{
    @Override
    public String makeWork() {
        return "Sells goods. ";
    }
}
