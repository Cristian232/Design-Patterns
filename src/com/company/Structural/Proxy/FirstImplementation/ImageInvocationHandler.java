package com.company.Structural.Proxy.FirstImplementation;

// Implements invocation handler. Your proxy code goes here.

import javafx.geometry.Point2D;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImageInvocationHandler implements InvocationHandler {


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Method setLocationMethod = Image.class.getMethod("setLocation",new Class[] {Point2D.class});
        if (setLocationMethod.equals(method)){
            Point2D point2D = (Point2D) args[0];
            System.out.println("Invocation handler originated location: " + point2D);
        }

        return null;
    }


}
