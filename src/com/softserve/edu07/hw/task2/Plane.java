package com.softserve.edu07.hw.task2;

class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int maxDistance, int passengers) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}

