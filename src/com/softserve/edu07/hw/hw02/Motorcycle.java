package com.softserve.edu07.hw.hw02;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(int passangers, int maxSpeed) {
        super(passangers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                " Passangers=" + getPassangers() +
                '}';
    }
}
