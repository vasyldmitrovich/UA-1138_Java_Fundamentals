package com.softserve.edu04.pt;

import java.util.Scanner;

public class PrTask03 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the country: ");
        String country = SCANNER.nextLine();
        Continent continent = Continent.getForCountry(country);
        System.out.println("Country " + country + " belongs to continent " + continent);
    }
}

enum Continent{//Do the same with this enum move to file Continent.java
    ASIA, AFRICA, EUROPE, AMERICA, AUSTRALIA;

    public String toString(){
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    public static Continent getForCountry(String country){
        return switch (country.toLowerCase()){
            case "ukraine", "germany", "france" -> EUROPE;
            case "usa", "canada" -> AMERICA;
            case "china", "india" -> ASIA;
            case "algeria", "egypt" -> AFRICA;
            case "australia" -> AUSTRALIA;
            default -> throw new IllegalArgumentException("Unknown country " + country);
        };
    }
}