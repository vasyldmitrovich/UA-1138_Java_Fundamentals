package com.softserve.edu05.hw;

import java.util.Arrays;

public class Hw3 {
    public static Car[] getCarByModelYear(int year, Car[] cars) {
        
        int arraySize = 0;
        // Define array size for fulfilling
        for (Car car: cars) {
            if(car.getYearOfProduction() == year) {
                arraySize++;
            }
        }
        System.out.println(arraySize);

        var carsWithSameYear = new Car[arraySize];
        // Fulfill array to return
        int carCounter = 0;
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getYearOfProduction() == year) {
                carsWithSameYear[carCounter] = cars[i];
                carCounter++;
            }
        }
        System.out.println(Arrays.toString(carsWithSameYear));
        return carsWithSameYear;
    }
    public static Car[] sortCarsByYear(Car[] cars) {
        Car[] sortedCars = cars.clone();
        for (int i = 0; i < sortedCars.length - 1; i++) {
            for (int j = 0; j < sortedCars.length - i - 1; j++) {
                if(sortedCars[j].getYearOfProduction() < sortedCars[j+1].getYearOfProduction()) {
                    var temp = sortedCars[j];
                    sortedCars[j] = sortedCars[j+1];
                    sortedCars[j+1] = temp;
                }
            }
        }
        return sortedCars;
    }
}
