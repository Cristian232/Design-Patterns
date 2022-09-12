package com.company;


import com.company.Structural.Proxy.FirstImplementation.Image;
import com.company.Structural.Proxy.FirstImplementation.ImageFactory;
import com.company.Structural.Proxy.FirstImplementation.ImageFactoryDynamic;
import javafx.geometry.Point2D;

public class Main {

    public static void main(String[] args) {

        Image image = ImageFactory.getImage("A1.bmp");
        image.setLocation(new Point2D(10,10));
        System.out.println("Image location is : " + image.getLocation());
        image.render();

        // Dynamic proxy

        Image imageDynamic = ImageFactoryDynamic.getImage();
        imageDynamic.setLocation(new Point2D(-10,-20));

    }

}
