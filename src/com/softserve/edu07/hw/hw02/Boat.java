package com.softserve.edu07.hw.hw02;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat(int passangers, int volume) {
        super(passangers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        super.isSailing();
    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                " Passangers=" + getPassangers() +
                '}';
    }
}
