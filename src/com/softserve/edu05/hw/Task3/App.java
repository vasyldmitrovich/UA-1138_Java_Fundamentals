package com.softserve.edu05.hw.Task3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Car[] cars ={
                new Car("Ford", 2023, 215),
                new Car("Audi", 2021, 310),
                new Car("BMW", 2023, 400),
                new Car("Toyota", 2019, 136),
        };

        App.getCarByModelYear(2023, cars);


    }

    public static Car getCarByModelYear(int year, Car[] cars) {
        for (Car car: cars) {
            if(car.getYearOfProduction() == year) {
                System.out.println(car);
            }
        }
        return null;
    }
}

