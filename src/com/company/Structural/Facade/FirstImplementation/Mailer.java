package com.company.Structural.Facade.FirstImplementation;

public class Mailer {
    public static Mailer getMailer() {
        return new Mailer();
    }

    public boolean send(Email email) {
        return true;
    }
}
