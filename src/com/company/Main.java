package com.company;


import com.company.Structural.Flyweight.FirstImplementation.ErrorMessageFactory;
import com.company.Structural.Flyweight.FirstImplementation.SystemErrorMessage;

public class Main {

    public static void main(String[] args) {

        SystemErrorMessage msg = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.ServerError);
        System.out.println(msg.getText("007"));

    }

}
