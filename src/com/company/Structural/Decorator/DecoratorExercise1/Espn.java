package com.company.Structural.Decorator.DecoratorExercise1;

public class Espn extends ChannelDecorator{

    public Espn(SatelliteTv satelliteTv) {
        super(satelliteTv);
    }

    @Override
    public void show(int nrOfChannels) {
        if (nrOfChannels>101 && nrOfChannels<201){
            System.out.println("Sports channel " + nrOfChannels);
        }else {
            System.out.println("Enjoy");
        }
    }

    @Override
    public int price() {
        return this.getSatelliteTv().price() + 50;
    }
}
