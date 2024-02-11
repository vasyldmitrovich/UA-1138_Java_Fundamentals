package com.softserve.edu06.pt.task2;

public class PrTask2 {
    public static void main(String[] args) {
        Car[] cars = {new Truck("Man", 120, 2011),
                new Sedan("BMW", 190, 2021)};
        for (var car : cars) {
            car.run();
            car.stop();
        }
    }
}






