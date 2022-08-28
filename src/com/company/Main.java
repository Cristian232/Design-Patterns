package com.company;


import com.company.Creational.Builder.BuilderExercise3.Account;

public class Main {

    public static void main(String[] args) {

        Account account = new Account.Builder().id(1).email("AAA").build();
        System.out.println(account.toString());





    }

}
