package com.company.Structural.Proxy.FirstImplementation;

import javafx.geometry.Point2D;


// Our concrete class providing functionality

public class Bitmap implements Image{

    private Point2D location;
    private String name;

    public Bitmap(String fileName) {
        //Loads image from disk
        System.out.println("Loaded from disk: " + fileName);
        this.name = fileName;
    }

    @Override
    public void setLocation(Point2D point2D) {
        this.location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendered " + this.name);
    }
}
