package com.softserve.edu07.hw.task2;

class Bus extends GroundVehicle {
    private String route;

    public Bus(String route, int passengers) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return getRoute();
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {

    }
}
