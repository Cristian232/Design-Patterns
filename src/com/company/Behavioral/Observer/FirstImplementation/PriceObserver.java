package com.company.Behavioral.Observer.FirstImplementation;

// Concrete observer

public class PriceObserver implements OrderObserver{


    @Override
    public void updated(Order order) {
        double total = order.getCostOfItems();
        if (total >= 500){
            order.setDiscount(20);
        } else if (total >= 200){
            order.setDiscount(10);
        }
    }
}
