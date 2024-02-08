package com.softserve.edu05.hw;

class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapasity;

    public Car(String type, int yearOfProduction, double engineCapasity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapasity = engineCapasity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapasity() {
        return engineCapasity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapasity=" + engineCapasity +
                '}';
    }
}
