package com.company.Structural.Decorator.DecoratorExercise1;

public class SkyTv implements SatelliteTv{



    @Override
    public void show(int nrOfChannels) {
        if (nrOfChannels<101){
            System.out.println("Basic News channel " + nrOfChannels);
        }else {
            System.out.println("You are not subscribed yet");
        }
    }

    @Override
    public int price() {
        return 100;
    }
}
