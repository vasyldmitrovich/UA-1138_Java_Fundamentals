package com.softserve.edu07.hw;

abstract class Passengers {
    private int passengers;//Make private

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}