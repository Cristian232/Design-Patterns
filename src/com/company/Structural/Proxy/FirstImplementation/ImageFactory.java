package com.company.Structural.Proxy.FirstImplementation;

// Factory to get image objects

public class ImageFactory {

    // Will provide proxy to caller instead of real object

    public static Image getImage(String name){
        return new ImageProxy(name);
    }


}
