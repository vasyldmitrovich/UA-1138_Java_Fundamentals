package com.softserve.edu05.hw.task3;

public class Car {//Good
    private final String type;//but why final???
    private int yearProduction;
    private final int capacity;//why final

    public static void sortCars(Car[] cars) {//Move this method to file HwTask3.java
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
    }//After constructors

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
