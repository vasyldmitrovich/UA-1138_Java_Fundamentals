package com.softserve.edu07.hw;

abstract class WaterVehicle extends Passengers implements Vehicle {

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}