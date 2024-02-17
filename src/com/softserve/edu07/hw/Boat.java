package com.softserve.edu07.hw;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("The Boat with " + getPassengers() + " passengers, and " + getVolume() + " volume is sailing around the sea.");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
