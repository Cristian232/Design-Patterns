package com.company.Behavioral.State.FirstImplementation;

public class InTransit implements OrderState{

    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier gateway for cancellation");
        System.out.println("Contacting payment gateway for transaction rollback");
        return 20;
    }

//    @Override
//    public OrderState next(){
//        return new Delivered();
//    }
}
