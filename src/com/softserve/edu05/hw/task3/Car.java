package com.softserve.edu05.hw.task3;

public class Car {
    private final String type;
    private int yearProduction;
    private final int capacity;

    public static void sortCars(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].yearProduction < cars[j + 1].yearProduction) {
                    var tmp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = tmp;
                }
            }
        }
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public Car(String type, int yearProduction, int capacity) {
        this.type = type;
        this.yearProduction = yearProduction;
        this.capacity = capacity;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearProduction=" + yearProduction +
                ", capacity=" + capacity +
                '}';
    }
}
