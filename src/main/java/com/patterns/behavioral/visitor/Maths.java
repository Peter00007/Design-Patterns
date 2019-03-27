package com.patterns.behavioral.visitor;


public class Maths implements HomeWorkElement{
    @Override
    public void beStudying(Guy guy) {
        guy.doHomeWork(this);
    }
}
