package com.softserve.edu05.hw.Task3;

import java.util.Arrays;

public abstract class Car {
    protected String type;
    private int yearProduction;
    private int capacity;

    public Car(String type, int yearProduction, int capacity) {
        this.type = type;
        this.yearProduction = yearProduction;
        this.capacity = capacity;
    }

    public static void sortCarsByYear(Car[] cars) {
        Arrays.sort(cars, (car1, car2) -> car2.getYearProduction() - car1.getYearProduction());
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearProduction=" + yearProduction +
                ", capacity=" + capacity +
                '}';
    }

    abstract void run();
}