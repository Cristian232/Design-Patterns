package com.company.Creational.AbstractFactory.FirstImplementation;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);
}
