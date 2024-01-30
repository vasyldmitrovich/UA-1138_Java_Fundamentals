package com.softserve.edu04.pt;

import java.util.Scanner;

public class PrTask3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter country name: ");
        String country = SCANNER.nextLine();
        Continent continent = Continent.getForCountry(country);
        System.out.println("Country named " + country + " belongs to " + continent);

    }
}

enum Continent {
    EUROPE, ASIA, AFRICA, AMERICA;

    public static Continent getForCountry(String country) {
        return switch (country.toUpperCase()) {
            case "UKRAINE", "GERMANY", "FRANCE" -> EUROPE;
            case "USA", "CANADA" -> AMERICA;
            default -> throw new IllegalArgumentException("Unknown country " + country);
        };

    }

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }


}