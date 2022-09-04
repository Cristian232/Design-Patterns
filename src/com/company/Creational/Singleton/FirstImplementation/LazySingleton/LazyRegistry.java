package com.company.Creational.Singleton.FirstImplementation.LazySingleton;

public class LazyRegistry {

    // Create a private constructor

    private LazyRegistry() {

    }

    // Create a private static volatile prop INSTANCE of type LazyRegistry // volatile is for read/write from main memory instead of cache

    private static volatile LazyRegistry INSTANCE;


    // Create a public static method getInstance()

    public static LazyRegistry getInstance(){
        if (INSTANCE == null){

            // Double check locking

            synchronized (LazyRegistry.class){
                if(INSTANCE == null) {
                    INSTANCE = new LazyRegistry();
                }
            }

        }

        return INSTANCE;
    }


}
