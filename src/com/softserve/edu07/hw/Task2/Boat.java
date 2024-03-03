package com.softserve.edu07.hw.Task2;

class Boat extends WaterVehicle {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void drive() {
        System.out.println("Boat is being driven on the water.");
    }

    public void isSailing() {
        System.out.println("Boat is currently sailing.");
    }
}
