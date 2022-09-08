package com.company.Structural.Facade.FirstImplementation;

public class Email {

        public static EmailBuilder getEmailBuilder(){
                return new EmailBuilder();
        }

        public static EmailBuilder getBuilder() {
                return new EmailBuilder();
        }
}
