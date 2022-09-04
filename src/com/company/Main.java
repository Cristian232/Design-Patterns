package com.company;



import com.company.Creational.Singleton.FirstImplementation.EagerSingleton.EagerRegistry;
import com.company.Creational.Singleton.FirstImplementation.LazySingeltonHolder.LazyRegistryIODH;
import com.company.Creational.Singleton.FirstImplementation.LazySingleton.LazyRegistry;

public class Main {

    public static void main(String[] args) {

        //Eager Singleton
        EagerRegistry registry = EagerRegistry.getInstance();

        //Lazy Singleton
        LazyRegistry registry1 = LazyRegistry.getInstance();

        //Lazy Singleton with holder
        LazyRegistryIODH registryIODH = LazyRegistryIODH.getInstance();

    }

}
