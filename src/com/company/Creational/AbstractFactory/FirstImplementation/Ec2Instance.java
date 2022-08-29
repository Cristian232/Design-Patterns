package com.company.Creational.AbstractFactory.FirstImplementation;

public class Ec2Instance implements Instance{

    public Ec2Instance(Capacity capacity) {
        System.out.println("Created Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Started Ec2Instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Ec2Instance");
    }
}
