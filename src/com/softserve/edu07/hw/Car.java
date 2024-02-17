package com.softserve.edu07.hw;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Model of this car is " + getModel() + ", and it is " + getPassengers() + " passengers capacity.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
