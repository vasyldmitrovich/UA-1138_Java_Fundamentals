package com.softserve.edu07.hw.Task2;

class Car extends GroundVehicle {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car is being driven on the road.");
    }
}
