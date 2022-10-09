package com.company.Structural.Decorator.DecoratorExercise1;

public abstract class ChannelDecorator implements SatelliteTv{

    private SatelliteTv satelliteTv;

    public ChannelDecorator(SatelliteTv satelliteTv) {
        this.satelliteTv = satelliteTv;
    }

    public SatelliteTv getSatelliteTv() {
        return satelliteTv;
    }

}
