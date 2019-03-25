package com.patterns.structural.adapter;


public class AdapterSchoolToUniversity extends School implements University{
    @Override
    public void rector() {
        director();
    }

    @Override
    public void headDepartment() {
        head();
    }

    @Override
    public void lecturer() {
        teacher();
    }

    @Override
    public void student() {
        schoolboy();
    }
}
