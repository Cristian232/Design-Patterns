package com.company.Creational.ObjectPool.FirstImplementation;

import javafx.geometry.Point2D;
        // concrete reusable
public class BitMap implements Image{

    private String name;

    private Point2D location;

    public BitMap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Sys name = " + name + " is at " + location);
    }

    @Override
    public Point2D getLocation() {
        return null;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

            @Override
            public void reset() {
                location = null;
                System.out.println("Bitmap was reset ");
            }
        }
