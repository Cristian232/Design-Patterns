package com.company.Structural.Flyweight.FirstImplementation;


// A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage{

    //some error message $errorCode
    private String messageTemplate;

    //http://subdomain.com/help?error=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String text) {
        return messageTemplate.replace("$errorCode", text) + helpUrlBase + text;
    }
}
