package com.company.Structural.Decorator.DecoratorExercise1;

public class Hulu extends ChannelDecorator{

    public Hulu(SatelliteTv satelliteTv) {
        super(satelliteTv);
    }

    @Override
    public void show(int nrOfChannels) {
        if (nrOfChannels>201 && nrOfChannels<301){
            System.out.println("Movie channel " + nrOfChannels);
        }else {
            System.out.println("Binge");
        }
    }

    @Override
    public int price() {
        return this.getSatelliteTv().price() + 80;
    }
}
