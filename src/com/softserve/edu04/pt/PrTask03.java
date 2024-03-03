package com.softserve.edu04.pt;

import java.util.Scanner;

public class PrTask03 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the country: ");
        String country = SCANNER.nextLine();
        Continent continent = getForCountry(country);
        System.out.println("Country " + country + " belongs to continent " + continent);
    }

    public static Continent getForCountry(String country) {
        return switch (country.toLowerCase()) {
            case "ukraine", "germany", "france" -> Continent.EUROPE;
            case "usa", "canada" -> Continent.AMERICA;
            case "china", "india" -> Continent.ASIA;
            case "algeria", "egypt" -> Continent.AFRICA;
            case "australia" -> Continent.AUSTRALIA;
            default -> throw new IllegalArgumentException("Unknown country " + country);
        };
    }
}

