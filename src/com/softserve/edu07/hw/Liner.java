package com.softserve.edu07.hw;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("The Liner with " + getPassengers() + " passengers, and " + getFloors() + " floors is sailing around the ocean.");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
