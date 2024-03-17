package com.softserve.edu07.hw.task2;

class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int maxSpeed, int passengers) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
