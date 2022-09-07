package com.company.Structural.Decorator.Firstimplementation;

// Concrete comp // obj to be decorated

public class TextMessage implements Message{

    private String msg;

    public TextMessage(String msg){
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return msg;
    }
}
