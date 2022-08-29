package com.company.Creational.AbstractFactory.FirstImplementation;

public class GoogleComputeEngineInstance implements Instance{

    public GoogleComputeEngineInstance(Capacity capacity) {

        System.out.println("Created Google Compute Engine Instance");

    }

    @Override
    public void start() {
        System.out.println("Compute Engine Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Computer Engine Instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute Engine Instance stopped");
    }
}
