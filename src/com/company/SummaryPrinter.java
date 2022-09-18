package com.company;

import com.company.Behavioral.Strategy.FirstImplementation.Order;

import java.util.Collection;
import java.util.Iterator;

// Concrete strategy
public class SummaryPrinter implements OrderPrinter{


    @Override
    public void print(Collection<Order> orders) {
        System.out.println("********** Summary Report ************");
        Iterator<Order> iterator = orders.iterator();
        for (int i = 0; iterator.hasNext();  i++) {
            Order order = iterator.next();
            System.out.println(i + " . " +
                    order.getId() + "\t" +
                    order.getDate() + "\t" +
                    order.getitems().size() + "\t" +
                    order.getTotal());
        }
        System.out.println("*************************************");
    }
}
