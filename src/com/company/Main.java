package com.company;


import com.company.Creational.FactoryMethod.FirstImplementation.OS;
import com.company.Creational.FactoryMethod.FirstImplementation.OSFactory;

public class Main {

    public static void main(String[] args) {

        // Factory Method Design Pattern
        // In Factory pattern, we create object without exposing the creation logic to the client and
        // refer to newly created object using a common interface.

        // Step 1: Create a Interface OS that has one method void showSpec()
        // Step 2: Create 3 Classes that implements OS with spec message Android, IOS, Windows
        // Step 3: Create a Factory class to generate object of concrete class based on String info param.
        //         with else if or switch logic based on string param

        // Step 4: In main instantiate Factory object and after call method from interface

        OSFactory os = new OSFactory();
        OS os1 = os.getOS("open");
        os1.showSpec();





    }

}
