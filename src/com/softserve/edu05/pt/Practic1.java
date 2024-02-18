package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Practic1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] cities = {"Kyiv", "Kharkiv", "Lviv", "Odesa" };
        System.out.println(Arrays.toString(cities));
        Arrays.sort(cities);
        System.out.println("Sorted array: " + Arrays.toString(cities));

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("Average value is: " + average);

        System.out.print("Enter name to search: ");
        String searchValue = scanner.nextLine();

        boolean found = false;
        for (var city : cities) {
            if (city.equals(searchValue)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("We found your search: " + searchValue);
        } else {
            System.out.println("No match found unfortunately " + searchValue);
        }
    }
}
