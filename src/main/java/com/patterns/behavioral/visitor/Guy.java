package com.patterns.behavioral.visitor;


public interface Guy {
    public void doHomeWork(UkrainianLanguage ukrainianLanguage);

    public void doHomeWork(ForeignLanguage foreignLanguage);

    public void doHomeWork(Maths maths);


}
