package com.company.Creational.Singleton.FirstImplementation.EagerSingleton;

public class EagerRegistry {

    // Make constructor private

    private EagerRegistry() {

    }

    // Create the Singleton instance // private static final field

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    // Create a public static method that returns this instance to the outside world

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }



}
