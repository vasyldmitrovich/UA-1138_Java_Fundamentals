package com.softserve.edu07.hw.hw02;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(int passangers, String route) {
        super(passangers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public String toString() {
        return "Bus{" +
                "route='" + route + '\'' +
                " Passangers=" + getPassangers() +
                '}';
    }
}
