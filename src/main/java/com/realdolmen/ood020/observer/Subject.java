package com.realdolmen.ood020.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public abstract  class Subject {   // Dit is een classe dit bestaat in Java, kan dus ook geimporteerd worden
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public List<Observer> getObservers() {
        return observers;
    }

    public int getState() {
        return state;
    }


    public void attach(Observer observer){
        observers.add(observer);

    }
    public void remove(Observer observer) {
        observers.remove(observer);
    }



    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
