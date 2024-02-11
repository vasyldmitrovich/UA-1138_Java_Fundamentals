package com.softserve.edu04.pt;

import java.util.Scanner;

public class ContinentFinder {
    public enum Continent {
        Europe, Asia, Africa, North_America, South_America,
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the country: ");
        String countryName = scanner.nextLine();

        Continent continent = getContinentForCountry(countryName);
        System.out.println("Contient for " + countryName + ": " + continent);

        scanner.close();
    }

    public static Continent getContinentForCountry(String countryName) {
        switch (countryName.toLowerCase()) {
            case "ukraine":
            case "france":
            case "spain":
                return Continent.Europe;
            case "china":
            case "india":
                return Continent.Asia;
            case "egypt":
            case "south africa":
                return Continent.Africa;
            case "usa":
            case "canada":
                return Continent.North_America;
            case "brazil":
            case "colombia":
                return Continent.South_America;
            default:
                return null;
        }
    }
}
