package com.company.Creational.Builder.BuilderExcercise1;

public class SpaceShipBuilder {


    protected String hull;

    protected String engine;

    protected String shields;

    protected String warpCore;

    protected String crew;

    public SpaceShipBuilder(String hull, String crew) {
        this.hull = hull;
        this.crew = crew;
    }

    public SpaceShipBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public SpaceShipBuilder shields(String shields) {
        this.shields = shields;
        return this;
    }

    public SpaceShipBuilder warpCore(String warpCore) {
        this.warpCore = warpCore;
        return this;
    }

    public SpaceShipBuilder build() {
        SpaceShipBuilder spaceShip = this;
        return spaceShip;
    }
}
