package com.company.Behavioral.Observer.ObserverExercise1;

public class Subscriber implements Observer{

    private String name;
    private Subject channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subject subject) {
        channel = subject;
    }

    @Override
    public void update() {
        System.out.println("Hello, my name is " + name + " :)");
    }
}
