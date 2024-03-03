package com.softserve.edu07.hw.Task2;

class Bus extends GroundVehicle {
    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving on the road.");
    }
}