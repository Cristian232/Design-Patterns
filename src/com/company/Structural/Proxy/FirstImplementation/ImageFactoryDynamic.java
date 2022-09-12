package com.company.Structural.Proxy.FirstImplementation;

import java.lang.reflect.Proxy;

public class ImageFactoryDynamic {

    public static Image getImage() {

      return (Image) Proxy.newProxyInstance(ImageFactoryDynamic.class.getClassLoader(),new Class[] {Image.class}, new ImageInvocationHandler());


    };

}
