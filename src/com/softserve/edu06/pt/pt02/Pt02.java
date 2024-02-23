package com.softserve.edu06.pt.pt02;

public class Pt02 {
    public static void main(String[] args) {//Ok
        Car[] cars = {
                new Truck("Man", 120, 2012),
                new Sedan("BMW", 250, 2020)};
        for (var car : cars) {
            car.run();
            car.stop();
        }
    }
}
