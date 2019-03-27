package com.patterns.behavioral.observer;


public interface Observed {
    public void addObserved(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
