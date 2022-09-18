package com.company.Behavioral.Template.FirstImplementation;


//Abstract base class defines the template method

import java.io.IOException;
import java.io.PrintWriter;

public abstract class OrderPrinter {

    public final void printOrder(Order order, String fileName) throws IOException {
        try(PrintWriter printWriter = new PrintWriter(fileName)){
            printWriter.println(start());
            printWriter.println(formatOrderNumber(order));
            printWriter.println(formatItems(order));
            printWriter.println(formatTotal(order));
            printWriter.println(end());
        }
    }

    protected abstract String end();

    protected abstract String formatTotal(Order order);

    protected abstract String formatItems(Order order);

    protected abstract String formatOrderNumber(Order order);

    protected abstract String start();
}
