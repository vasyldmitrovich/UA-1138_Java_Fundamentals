package com.softserve.edu04.pt;

import java.util.Scanner;

public class Pt03 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input countries: ");
        String countries = SCANNER.nextLine();
        System.out.println(Continent.getCountry(countries));
    }
}

enum Continent {
    EUROPE, ASIA, AFRICA, AMERICA;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    public static Continent getCountry(String country) {
        return switch (country) {
            case "Germany", "United Kingdom", "France", "Italy", "Spain", "Poland",
                    "Ukraine", "Romania", "Netherlands", "Belgium", "Sweden",
                    "Czech Republic", "Greece", "Portugal", "Hungary", "Belarus", "Austria",
                    "Switzerland", "Serbia", "Bulgaria", "Denmark", "Slovakia", "Finland", "Norway",
                    "Ireland", "Croatia", "Moldova", "Bosnia and Herzegovina", "Albania", "Lithuania",
                    "Slovenia", "North Macedonia", "Latvia", "Estonia", "Luxembourg", "Montenegro",
                    "Malta", "Iceland", "Andorra", "Liechtenstein", "Monaco", "San Marino", "Holy See" -> EUROPE;
            case "Nigeria", "Ethiopia", "Egypt",
                    "DR Congo", "Tanzania", "South Africa" -> AFRICA;
            case "India", "China", "Indonesia",
                    "Pakistan", "Bangladesh", "Japan", "Philippines" -> ASIA;
            case "Canada", "United States", "Mexico",
                    "Brazil", "Colombia", "Argentina" -> AMERICA;
            default -> throw new IllegalArgumentException("Please write the other countries");
        };
    }
}
