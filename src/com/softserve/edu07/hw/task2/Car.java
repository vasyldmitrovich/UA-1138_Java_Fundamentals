package com.softserve.edu07.hw.task2;

class Car extends GroundVehicle {
    private String model;

    public Car(String model, int passengers) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {

    }
}
