package com.company.Creational.FactoryMethod.FactoryExercise1;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("You got a email notification");
    }
}
