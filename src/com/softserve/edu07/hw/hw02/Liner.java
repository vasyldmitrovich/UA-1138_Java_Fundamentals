package com.softserve.edu07.hw.hw02;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner(int passangers, int floors) {
        super(passangers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        super.isSailing();
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                " Passangers=" + getPassangers() +
                '}';
    }
}
