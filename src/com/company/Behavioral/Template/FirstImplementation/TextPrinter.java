package com.company.Behavioral.Template.FirstImplementation;

// Concrete implementation

import java.util.Map;

public class TextPrinter extends OrderPrinter{

    @Override
    protected String end() {
        return "";
    }

    @Override
    protected String formatTotal(Order order) {
        return "Total $" + order.getTotal();
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder stringBuilder = new StringBuilder("Items\n----------------\n");
        for (Map.Entry<String,Double> entry : order.getitems().entrySet()){
            stringBuilder.append(entry.getKey() + " $" + entry.getValue() + "\n");
        }
        stringBuilder.append("----------------");
        return stringBuilder.toString();
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "Order #" + order.getId();
    }

    @Override
    protected String start() {
        return "Order Details";
    }
}
