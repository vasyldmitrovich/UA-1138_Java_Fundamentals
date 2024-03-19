package com.softserve.edu12.pt.pt02;

public class Pt02 {
    public static void main(String[] args) throws ColorException, TypeException {
        Plant[] plants = new Plant[2];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.readFromConsole();
        }
        for (var plant : plants){
            System.out.println(plant);
        }
    }
}
