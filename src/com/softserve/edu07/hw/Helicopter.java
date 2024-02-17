package com.softserve.edu07.hw;

public class Helicopter extends FlyingVehicle {
    protected int weight;
    protected int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("The Helicopter with " + getPassengers() + " passengers, and " + weight + " kg weight takes off from the ground.");
    }

    @Override
    public void land() {
        System.out.println("The Helicopter lands after reaching " + maxHeight + " meters height.");
    }
}
