package com.company.Creational.ObjectPool.FirstImplementation;

import javafx.geometry.Point2D;

        // Represents abstract reusable

public interface Image extends Poolable{

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);

}
