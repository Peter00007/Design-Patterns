package com.patterns.behavioral.visitor;


public class ForeignLanguage implements HomeWorkElement{
    @Override
    public void beStudying(Guy guy) {
        guy.doHomeWork(this);
    }
}
