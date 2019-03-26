package com.patterns.structural.composite;


public class ShopRunner {
    public static void main(String[] args) {
        Team team = new Team();

        Employee firstSeller = new Seller();
        Employee secondSeller = new Seller();
        Employee supplier = new Supplier();

        team.addEmployee(firstSeller);
        team.addEmployee(secondSeller);
        team.addEmployee(supplier);

        team.createTeam();
    }
}
