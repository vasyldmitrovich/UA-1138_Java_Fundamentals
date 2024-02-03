package com.softserve.edu04.pt;

import java.util.Scanner;

public class PT3 {
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
    System.out.println("Enter country ");
    String country = SCANNER.nextLine();
    Continent continent = Continent.getForCountry(country);
    System.out.println("Country  " + country + " belongs to " + continent);
    }
}
enum Continent {
    EUROPE, ASIA, AFRICA;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    public static Continent getForCountry(String country){
        return switch (country){
            case "Ukraine" -> EUROPE;
            case "Japan" -> ASIA;
            case "Egypt" -> AFRICA;
            default -> null;

        };
    };
}