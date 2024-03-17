package com.softserve.edu07.hw.task2;

class Boat extends WaterVehicle {
    private int volume;

    public Boat(int volume, int passengers) {
        super(passengers);
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

    }
}
