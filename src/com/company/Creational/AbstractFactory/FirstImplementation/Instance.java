package com.company.Creational.AbstractFactory.FirstImplementation;

public interface Instance {

    enum Capacity {micro, small, large};

    void start();

    void attachStorage(Storage storage);

    void stop();
}
