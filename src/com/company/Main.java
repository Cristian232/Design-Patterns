package com.company;


import com.company.Creational.AbstractFactory.FirstImplementation.AwsResourceFactory;
import com.company.Creational.AbstractFactory.FirstImplementation.Instance;
import com.company.Creational.AbstractFactory.FirstImplementation.ResourceFactory;
import com.company.Creational.AbstractFactory.FirstImplementation.Storage;

public class Main {

    private ResourceFactory factory;

    public Main(ResourceFactory factory){
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib){
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args)  {

        Main aws = new Main(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.small, 20480);
        i1.start();
        i1.stop();

    }

}
