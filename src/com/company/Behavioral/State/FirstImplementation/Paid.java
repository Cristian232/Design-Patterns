package com.company.Behavioral.State.FirstImplementation;

public class Paid implements OrderState{

    @Override
    public double handleCancellation() {
        System.out.println("Contact payment gateway to roll back transaction");
        return 0;
    }
}
