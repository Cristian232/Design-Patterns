package com.company;


import com.company.Behavioral.Observer.FirstImplementation.Order;
import com.company.Behavioral.Observer.FirstImplementation.PriceObserver;


public class Main {

    public static void main(String[] args) {

        Order order = new Order("100");

        PriceObserver priceObserver = new PriceObserver();

        order.atach(priceObserver);

        order.addItems(600);

        System.out.println(order);

    }

}
