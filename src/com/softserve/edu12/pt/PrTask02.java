package com.softserve.edu12.pt;

public class PrTask02 {
    public static void main(String[] args) throws ColorException, TypeException {
        Plant[] plants = new Plant[2];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.readFromConsole();
        }
        for (var plant : plants) {
            System.out.println(plant);
        }
    }
}
