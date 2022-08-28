package com.company.Creational.FactoryMethod.FactoryExercise1;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("You got a push notification");
    }
}
