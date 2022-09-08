package com.company;


import com.company.Structural.Facade.FirstImplementation.EmailFacade;
import com.company.Structural.Facade.FirstImplementation.Order;

public class Main {



    public static void main(String[] args) {

        Order order = new Order("101",99.99);

        EmailFacade emailFacade = new EmailFacade();

        boolean result = emailFacade.sendOrderEmail();

        System.out.println("Order email" + ( result?"sent!":"not sent!"));
    }



}
