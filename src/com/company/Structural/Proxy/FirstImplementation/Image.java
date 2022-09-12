package com.company.Structural.Proxy.FirstImplementation;

// Interface implemented by proxy and concrete objects

import javafx.geometry.Point2D;

public interface Image {

    void setLocation(Point2D point2D);

    Point2D getLocation();

    void render();

}
