package com.company.Creational.FactoryMethod.FactoryExercise1;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("You got a sms notification");
    }
}
