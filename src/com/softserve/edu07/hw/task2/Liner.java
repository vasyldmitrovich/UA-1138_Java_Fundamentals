package com.softserve.edu07.hw.task2;

class Liner extends WaterVehicle {
    private int floors;

    public Liner(int floors, int passengers) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
