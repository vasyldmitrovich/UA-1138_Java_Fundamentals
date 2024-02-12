package com.softserve.edu06.pt;

public class PtTask02 {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Man", 120, 2005),
                new Sedan("BMW", 190, 2020)
        };
        for (var car : cars) {
            car.run();
            car.stop();
        }

    }
}
