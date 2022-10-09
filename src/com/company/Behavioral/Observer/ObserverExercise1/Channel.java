package com.company.Behavioral.Observer.ObserverExercise1;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

    private List<Observer> subs;
    private String name;

    public String getName() {
        return name;
    }

    public Channel() {
        subs = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        subs.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subs.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:subs) {
            observer.update();
        }
    }

    @Override
    public void upload(String title) {
        System.out.println("Updated " + title);
        notifyObservers();
    }
}
