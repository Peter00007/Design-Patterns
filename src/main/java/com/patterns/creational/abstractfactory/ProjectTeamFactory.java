package com.patterns.creational.abstractfactory;

public interface ProjectTeamFactory {
    Owner getOwner();
    Employee getEmployee();
    Provider getProvider();
}
