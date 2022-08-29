package com.company.Creational.Prototype.FirstImplementation;

public class General extends GameUnit{

    private String state = "idle";

    public void boostMorale(){
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General" +
                state + '@' +
                getPosition();
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not possible");
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are Unique");
    }
}
