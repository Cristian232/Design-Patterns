package com.company.Structural.Adapter.FirstImplementation.ClassAdapter;

// Cx code that req customer interface

public class BusinessCardDesigner {

    public String designCard(Customer customer){
        String card = "";

        card += customer.getName();
        card += '\n' + customer.getDesignation();
        card += '\n' + customer.getAddress();

        return card;
    }



}
