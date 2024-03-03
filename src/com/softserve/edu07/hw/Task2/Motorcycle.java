package com.softserve.edu07.hw.Task2;

class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving on the road.");
    }
}
