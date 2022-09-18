package com.company;


import com.company.Behavioral.State.FirstImplementation.Order;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();
        order.paymentSuccessful();
        order.cancel();

    }

}
