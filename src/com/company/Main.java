package com.company;


import com.company.Creational.ObjectPool.FirstImplementation.BitMap;
import com.company.Creational.ObjectPool.FirstImplementation.ObjectPool;
import javafx.geometry.Point2D;

public class Main {


    public static final ObjectPool<BitMap> bitmapPool = new ObjectPool<>(()->new BitMap("Logo.bmp"),10);

    public static void main(String[] args) {

        BitMap b1 = bitmapPool.get();
        b1.setLocation(new Point2D(10,2));
        BitMap b2 = bitmapPool.get();
        b2.setLocation(new Point2D(5,3));

        b1.draw();
        b2.draw();

        bitmapPool.release(b1);
        bitmapPool.release(b2);

    }

}
