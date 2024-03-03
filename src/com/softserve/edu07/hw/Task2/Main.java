package com.softserve.edu07.hw.Task2;

public class Main {
    public static void main(String[] args) {
        Liner titanic = new Liner() {
            @Override
            public void drive() {

            }
        };
        Boat ferry = new Boat();
        Plane boeing = new Plane();
        Helicopter apache = new Helicopter();
        Bus cityBus = new Bus();
        Motorcycle harley = new Motorcycle();
        Car toyota = new Car();


        titanic.setFloors(5);
        System.out.println("Liner floors: " + titanic.getFloors());
        titanic.isSailing();

        // Test methods for Boat
        ferry.setVolume(100);
        System.out.println("Boat volume: " + ferry.getVolume());
        ferry.isSailing();

        // Test methods for Plane
        boeing.setMaxDistance(5000);
        System.out.println("Plane max distance: " + boeing.getMaxDistance());
        boeing.fly();
        boeing.land();

        // Test methods for Helicopter
        apache.setMaxHeight(1000);
        System.out.println("Helicopter max height: " + apache.getMaxHeight());
        apache.fly();
        apache.land();

        // Test methods for Bus
        cityBus.setRoute("Route 1");
        System.out.println("Bus route: " + cityBus.getRoute());
        cityBus.drive();

        // Test methods for Motorcycle
        harley.setMaxSpeed(150);
        System.out.println("Motorcycle max speed: " + harley.getMaxSpeed());
        harley.drive();

        // Test methods for Car
        toyota.setModel("Toyota");
        System.out.println("Car model: " + toyota.getModel());
        toyota.drive();

        // Set number of passengers for each vehicle
        titanic.setPassengers(3000);
        ferry.setPassengers(200);
        boeing.setPassengers(150);
        apache.setPassengers(5);
        cityBus.setPassengers(50);
        harley.setPassengers(1);
        toyota.setPassengers(4);

        // Print number of passengers for each vehicle
        System.out.println("Number of passengers for each vehicle:");
        System.out.println("Liner passengers: " + titanic.getPassengers());
        System.out.println("Boat passengers: " + ferry.getPassengers());
        System.out.println("Plane passengers: " + boeing.getPassengers());
        System.out.println("Helicopter passengers: " + apache.getPassengers());
        System.out.println("Bus passengers: " + cityBus.getPassengers());
        System.out.println("Motorcycle passengers: " + harley.getPassengers());
        System.out.println("Car passengers: " + toyota.getPassengers());

    }
}
