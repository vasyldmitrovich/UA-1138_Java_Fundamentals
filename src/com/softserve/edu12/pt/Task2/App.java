package com.softserve.edu12.pt.Task2;

public class App {
    public static void main(String[] args) {
        Plant[] plants = new Plant[2];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.readFromConsole();
        }

        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }
}
