package com.company.Creational.Builder.BuilderExercise2;

public class Computer {

    // Step 1: Create only getters
    // Step 2: Create public static inner Builder class
    // Step 3: Copy all variables from base class to the inner class
    // Step 4: Create constructor for builder with the required parameters
    // Step 5: Create setter for the remaining parameters with return type Builder that returns this
    // Step 6: Create build() method to return the instance of computer in builder
    // Step 7: Create private constructor in computer with builder parameter that sets values


    // required parameters
        private String ram;
        private String cpu;
        private String hdd;

    // optional parameters
        private boolean hasGraphicsCard;
        private boolean hasBluetooth;

    public Computer(Builder builder) {
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.hdd = builder.hdd;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public boolean isHasGraphicsCard() {
        return hasGraphicsCard;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public static class Builder {

        // required parameters
        private String ram;
        private String cpu;
        private String hdd;

        // optional parameters
        private boolean hasGraphicsCard;
        private boolean hasBluetooth;

        public Builder(String ram, String cpu, String hdd) {
            this.ram = ram;
            this.cpu = cpu;
            this.hdd = hdd;
        }

        public Builder setHasGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setHasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build(){
           return new Computer(this);
        }
    }

}
