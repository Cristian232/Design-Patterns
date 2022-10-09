package com.company.Behavioral.Observer.ObserverExercise1;

public interface Subject {

    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyObservers();

    public void upload(String title);

}
