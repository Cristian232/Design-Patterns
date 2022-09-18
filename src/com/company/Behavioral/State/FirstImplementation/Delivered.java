package com.company.Behavioral.State.FirstImplementation;

public class Delivered implements OrderState{

    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for item pickup");
        System.out.println("Payment rollback to be initiated on item return");
        return 30;
    }



}
