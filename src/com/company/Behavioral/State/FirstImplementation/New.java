package com.company.Behavioral.State.FirstImplementation;

public class New implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("It's a new order. No processing will be done.");
        return 0;
    }

}
