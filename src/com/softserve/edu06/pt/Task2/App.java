package com.softserve.edu06.pt.Task2;

public class App {//Here is ok
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Man", 130, 2020),
                new Sedan("Ford", 210, 2023),
        };

        for (Car car : cars) {
            car.run();
            car.stop();
        }
    }
}
