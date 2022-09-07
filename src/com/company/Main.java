package com.company;

import com.company.Structural.Decorator.Firstimplementation.HtmlEncodedMessage;
import com.company.Structural.Decorator.Firstimplementation.Message;
import com.company.Structural.Decorator.Firstimplementation.TextMessage;

public class Main {

    public static void main(String[] args) {

        Message m = new TextMessage("TextMessage");
        System.out.println(m.getContent());

        Message decorator = new HtmlEncodedMessage(m);
        System.out.println(decorator.getContent());

    }



}
