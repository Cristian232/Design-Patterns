package com.company.Creational.AbstractFactory.FirstImplementation;

public class GoogleCloudStorage implements Storage{

    public GoogleCloudStorage(int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gspcs1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}
