package com.company.Creational.Prototype.FirstImplementation;

public class Swordsman extends GameUnit{

    private String state = "idle";

    public void atack(){
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman" +
                state + '@' +
                getPosition();
    }
}
