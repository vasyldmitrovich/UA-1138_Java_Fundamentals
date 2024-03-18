package com.softserve.edu07.hw;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("The Motorcycle with " + getPassengers() + " passenger is driving at speed " + getMaxSpeed() + ".");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}