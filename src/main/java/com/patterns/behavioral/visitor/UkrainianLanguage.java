package com.patterns.behavioral.visitor;


public class UkrainianLanguage implements HomeWorkElement{
    @Override
    public void beStudying(Guy guy) {
        guy.doHomeWork(this);
    }
}
