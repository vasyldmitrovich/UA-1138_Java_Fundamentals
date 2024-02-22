package com.softserve.edu07.hw.hw02;

public class WaterVehicle extends Passengers implements Vehicle{
    public WaterVehicle(int passangers) {
        super(passangers);
    }

    public void isSailing(){
        System.out.println("Can sailing");
    }

}
