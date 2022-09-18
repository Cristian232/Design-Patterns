package com.company;

import com.company.Behavioral.Strategy.FirstImplementation.Order;

import java.util.Collection;

//Strategy
public interface OrderPrinter {

    void print(Collection<Order> orders);

}
