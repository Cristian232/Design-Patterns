package com.company.Creational.FactoryMethod.FactoryExercise1;

public class NotificationFactory {

    public Notification createNotification(String notifyType){

        if (notifyType == null || notifyType.isEmpty())
            return null;

        switch(notifyType){
            case "Sms":
                return new SmsNotification();
            case "Email":
                return new EmailNotification();
            case "Push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown type " + notifyType );
        }

    }

}
