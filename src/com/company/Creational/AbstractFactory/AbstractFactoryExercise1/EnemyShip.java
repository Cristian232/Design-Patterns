package com.company.Creational.AbstractFactory.AbstractFactoryExercise1;

public abstract class EnemyShip {

    String name;
    Double speed;
    Double dmg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDmg() {
        return dmg;
    }

    public void setDmg(Double dmg) {
        this.dmg = dmg;
    }
}
