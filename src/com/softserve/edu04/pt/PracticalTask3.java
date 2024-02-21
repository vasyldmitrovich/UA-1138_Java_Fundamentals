package com.softserve.edu04.pt;

import java.util.Scanner;

public class PracticalTask3 {
    static String name;

    public static void main(String[] args) throws IllegalAccessException {
        PracticalTask3 continent = new PracticalTask3();
        continent.input();
        System.out.println(continent.getContinents(continent.getName()));
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of continent: ");
        name = scanner.nextLine();
    }

    String getName() {
        return name;
    }

    String getContinents(String name) throws IllegalAccessException {
        return switch (name) {
            case "Germany", "France", "Ukraine" -> Continent.EUROPE.continentName;
            case "USA", "Mexico", "Canada" -> Continent.AMERICA.continentName;
            case "China", "India", "Japan", "Korea" -> Continent.ASIA.continentName;
            case "Egypt", "Nigeria", "Morocco" -> Continent.AFRICA.continentName;
            default -> throw new IllegalAccessException("Invalid continent name!");
        };
    }

    enum Continent {
        EUROPE("Europe"),
        ASIA("Asia"),
        AFRICA("Africa"),
        AMERICA("America");
        final String continentName;

        Continent(String continentName) {
            this.continentName = continentName;
        }
    }
}