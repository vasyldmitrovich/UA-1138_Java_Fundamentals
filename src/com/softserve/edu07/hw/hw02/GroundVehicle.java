package com.softserve.edu07.hw.hw02;

public class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle(int passangers) {
        super(passangers);
    }

    public void drive(){
        System.out.println("Can ride");
    }

}
