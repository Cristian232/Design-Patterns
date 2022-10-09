package com.company;


import com.company.Structural.Decorator.DecoratorExercise1.Espn;
import com.company.Structural.Decorator.DecoratorExercise1.Hulu;
import com.company.Structural.Decorator.DecoratorExercise1.SatelliteTv;
import com.company.Structural.Decorator.DecoratorExercise1.SkyTv;

public class Main {

    public static void main(String[] args) {

        SatelliteTv satelliteTv = new Espn(new Hulu(new SkyTv()));

        satelliteTv.show(5);

        System.out.println(satelliteTv.price());

        SatelliteTv satelliteTv1 = new Hulu(new SkyTv());

        satelliteTv1.show(300);

        System.out.println(satelliteTv1.price());

    }

}
