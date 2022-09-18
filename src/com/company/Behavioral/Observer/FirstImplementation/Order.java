package com.company.Behavioral.Observer.FirstImplementation;

// A concrete subject

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;

    private double costOfItems;

    private int count;

    public Order(String id) {
        this.id = id;
    }

    public double getTotal(){
        return costOfItems;
    }

    public void addItems(double price) {
        costOfItems += price;
        count++;
        observers.forEach(orderObserver -> orderObserver.updated(this));
    }

    private double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCount(){
        return count;
    }

    public double getCostOfItems(){
        return costOfItems - discount;
    }

    private List<OrderObserver> observers = new ArrayList<>();

    public void atach(OrderObserver orderObserver){
        observers.add(orderObserver);
    }

    public void detach(OrderObserver orderObserver){
        observers.remove(orderObserver);
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    private double shippingCost;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", costOfItems=" + costOfItems +
                ", count=" + count +
                ", discount=" + discount +
                ", observers=" + observers +
                ", shippingCost=" + shippingCost +
                '}';
    }
}

