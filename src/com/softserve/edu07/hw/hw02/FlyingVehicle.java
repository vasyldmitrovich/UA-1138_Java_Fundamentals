package com.softserve.edu07.hw.hw02;

public class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle(int passangers) {
        super(passangers);
    }

    public void fly(){
        System.out.println("Can fly");
    }

    public void land(){
        System.out.println("Can stay a land");
    }

}
