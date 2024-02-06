package com.softserve.edu04.pt;

import java.util.Locale;
import java.util.Scanner;

public class pt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter country name:");
        String country = scanner.nextLine();
        Continent continent = Continent.getForCountry(country);
        System.out.println(
                "Country named '" + country +
                        "' belongs to " + continent);
    }
}

enum Continent{
    ASIA, EUROPE, AMERICA, AFRICA;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase(Locale.ROOT);
    }

    public static Continent getForCountry(String country){//This method should be in class like App.java where is main method, not here
        return switch (country.toUpperCase()){
            case "UKRAINE", "GERMANY", "FRANCE" -> EUROPE;
            case "USA", "CANADA" -> AMERICA;
            case "JAPAN", "CHINA", "INDIA" -> ASIA;
            case "EGYPT", "ALGERIA", "CAMEROON" -> AFRICA;
            default -> throw new IllegalArgumentException(
                    "Unknown country " +
                    country);
        };
    }
}
