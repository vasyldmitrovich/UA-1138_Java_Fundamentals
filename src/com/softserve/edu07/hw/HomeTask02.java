package com.softserve.edu07.hw;

public class HomeTask02 {//Ok
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Liner(1000, 4),
                new Boat(10, 300),
                new Plane(180, 1000),
                new Helicopter(12, 2000, 700),
                new Bus(45, "home"),
                new Motorcycle(1, 220),
                new Car(4, "Tesla"),
        };

        for (var vehicle : vehicles) {
            if (vehicle instanceof WaterVehicle) {
                ((WaterVehicle) vehicle).isSailing();
            } else if (vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
            } else {
                ((GroundVehicle) vehicle).drive();
            }
        }
    }
}
