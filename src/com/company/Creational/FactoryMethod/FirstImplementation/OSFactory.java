package com.company.Creational.FactoryMethod.FirstImplementation;

public class OSFactory {

    public OS getOS(String info){

        if (info == null){
            return null;
        }else if (info.equalsIgnoreCase("Open")){
            return new Android();
        }else if (info.equalsIgnoreCase("Closed")){
            return new IOS();
        }else return new Windows();
    }

}
