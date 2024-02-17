package com.softserve.edu07.hw;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("The Bus with " + getPassengers() + " passengers is heading " + getRoute() + ".");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
