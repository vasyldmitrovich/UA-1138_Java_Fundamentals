package com.softserve.edu07.hw;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("The Plane with " + getPassengers() + " passengers takes off from the ground.");
    }

    @Override
    public void land() {
        System.out.println("The Plane lands after " + getMaxDistance() + " miles at the airport.");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
