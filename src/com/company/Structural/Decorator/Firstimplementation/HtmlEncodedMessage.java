package com.company.Structural.Decorator.Firstimplementation;

public class HtmlEncodedMessage implements Message{

    private Message msg;

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return " Encoded " + msg.getContent();
    }
}
