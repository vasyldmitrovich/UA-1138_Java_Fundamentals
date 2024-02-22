package com.softserve.edu07.hw.hw02;

public class Car extends GroundVehicle{
    private String model;

    public Car(int passangers, String model) {
        super(passangers);
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
        super.drive();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                " Passangers=" + getPassangers() +
                '}';
    }
}
