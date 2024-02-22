package com.softserve.edu07.hw.hw02;

public class Hw02 {
    public static void main(String[] args) {
        Passengers[] passengers ={
                new Boat(3, 23),
                new Liner(700, 3),
                new Plane(150,600),
                new Helicopter(5, 399, 1000),
                new Car(5, "Tesla"),
                new Motorcycle(2, 300),
                new Bus(35, "Odesa-Kyiv"),
        };

        for (var passanger : passengers){
            System.out.println(passanger);
        }
    }
}
