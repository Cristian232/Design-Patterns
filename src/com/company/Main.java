package com.company;


import com.company.Creational.FactoryMethod.FactoryExercise1.Notification;
import com.company.Creational.FactoryMethod.FactoryExercise1.NotificationFactory;

public class Main {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        notificationFactory.createNotification("Push").notifyUser();


    }

}
