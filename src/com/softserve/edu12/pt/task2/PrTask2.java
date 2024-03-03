package com.softserve.edu12.pt.task2;

public class PrTask2 {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.readFromConsole();
        }
        for (var plant : plants) {
            System.out.println(plant);
        }
    }
}




