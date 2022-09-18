package com.company;


import com.company.Behavioral.Template.FirstImplementation.Order;
import com.company.Behavioral.Template.FirstImplementation.OrderPrinter;
import com.company.Behavioral.Template.FirstImplementation.TextPrinter;

import java.io.IOException;

public class Main {



    public static void main(String[] args) throws IOException {

        Order order = new Order("1001");
        order.addItem("Soda",2.50);
        order.addItem("Pizza",15.99);
        order.addItem("Ice",1.11);

        OrderPrinter orderPrinter = new TextPrinter();
        orderPrinter.printOrder(order,"1001.txt");

    }


}
