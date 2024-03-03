package com.softserve.edu07.hw.Task2;

class Plane extends FlyingVehicle {
    private int maxDistance;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying in the air.");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing.");
    }

    @Override
    public void drive() {

    }
}