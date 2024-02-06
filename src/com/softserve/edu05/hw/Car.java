package com.softserve.edu05.hw;

public class Car {
    private final String type;
    private final int yearOfProduction;
    private final int engineCapacity;

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
