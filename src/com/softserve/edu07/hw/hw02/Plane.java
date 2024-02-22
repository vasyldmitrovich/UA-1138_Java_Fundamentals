package com.softserve.edu07.hw.hw02;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passangers, int maxDistance) {
        super(passangers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistance=" + maxDistance +
                " Passangers=" + getPassangers() +
                '}';
    }
}
