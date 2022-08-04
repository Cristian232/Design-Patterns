package com.company;


import com.company.Creational.BuilderExcercise1.SpaceShip;
import com.company.Creational.BuilderExcercise1.SpaceShipBuilder;

public class Main {

    public static void main(String[] args) {

    // Builder used for creating immutable objects with multiple parameters
    // Step 1 : Create a base class with only getters and constructor with 1 param of builder class
    // Step 2 : Create a builder class with same properties
    // Step 3 : In builder class create 1 constructor for the mandatory parameters that setts props
    // Step 4 : Builder class create a func for each of the remaining fields that setts props and returns this;
    // Step 5 : Builder class create a func build() that returns a builder class and
    // creates a builder class that gets the values of this


        SpaceShip enterprise = new SpaceShip(new SpaceShipBuilder("MaxHull","2000").shields("MaxShields").build());

        System.out.println(enterprise);
    }

}
