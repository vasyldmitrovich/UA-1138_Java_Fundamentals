package com.softserve.edu05.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Hw3Test {

    @Test
    void getCarByModelYear() {
        Car[] cars1 = {
                new Car("Toyota", 2010, 100),
                new Car("BMW", 2015, 100),
                new Car("Mercedes", 2010, 100),
                new Car("Audi", 2018, 100)
        };

        Car[] cars2 = {
                new Car("Toyota", 2011, 100),
                new Car("BMW", 2012, 100),
                new Car("Mercedes", 2013, 100),
                new Car("Audi", 2014, 100)
        };

        Car[] result1 = Hw3.getCarByModelYear(2010, cars1);
        Car[] result2 = Hw3.getCarByModelYear(2010, cars2);


        Assertions.assertAll(() -> assertNotNull(result1),
                             () -> assertNotNull(result2));

        Assertions.assertAll(() -> assertEquals(2, result1.length),
                             () -> assertEquals(0, result2.length));


        for (Car car : result1) {
            assertEquals(2010, car.getYearOfProduction());
        }

        for (Car car : result2) {
            assertEquals(0, car.getYearOfProduction());
        }

    }

    @Test
    void sortCarsByYear() {

        Car[] cars1 = {
                new Car("Toyota", 2010, 100),
                new Car("BMW", 2015, 100),
                new Car("Mercedes", 2010, 100),
                new Car("Audi", 2018, 100)
        };

        Car[] cars2 = {
                new Car("Toyota", 2011, 100),
                new Car("BMW", 2012, 100),
                new Car("Mercedes", 2013, 100),
                new Car("Audi", 2014, 100)
        };

        Car[] sortedCars1 = Hw3.sortCarsByYear(cars1);
        Car[] sortedCars2 = Hw3.sortCarsByYear(cars2);

        Assertions.assertAll(   () -> assertNotNull(sortedCars1),
                                () -> assertNotNull(sortedCars2));

        Assertions.assertAll(   () -> assertEquals(cars1.length, sortedCars1.length),
                                () -> assertEquals(cars2.length, sortedCars2.length));

        for (int i = 0; i < sortedCars1.length - 1; i++) {
            assertTrue(sortedCars1[i].getYearOfProduction() >= sortedCars1[i + 1].getYearOfProduction());
        }

        for (int i = 0; i < sortedCars2.length - 1; i++) {
            assertTrue(sortedCars2[i].getYearOfProduction() > sortedCars2[i + 1].getYearOfProduction());
        }

    }
}