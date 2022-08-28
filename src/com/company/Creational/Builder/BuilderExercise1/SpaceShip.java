package com.company.Creational.Builder.BuilderExercise1;

public class SpaceShip {

    private String hull;

    private String engine;

    private String shields;

    private String warpCore;

    private String crew;

    public SpaceShip(SpaceShipBuilder builder) {
        this.hull = builder.hull;
        this.engine = builder.engine;
        this.shields = builder.shields;
        this.warpCore =builder.warpCore;
        this.crew = builder.crew;
    }

    public String getHull() {
        return hull;
    }

    public String getEngine() {
        return engine;
    }

    public String getShields() {
        return shields;
    }

    public String getWarpCore() {
        return warpCore;
    }

    public String getCrew() {
        return crew;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "hull='" + hull + '\'' +
                ", engine='" + engine + '\'' +
                ", shields='" + shields + '\'' +
                ", warpCore='" + warpCore + '\'' +
                ", crew='" + crew + '\'' +
                '}';
    }
}
