package com.softserve.edu07.hw;

abstract class GroundVehicle extends Passengers implements Vehicle {

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract public void drive();
}
