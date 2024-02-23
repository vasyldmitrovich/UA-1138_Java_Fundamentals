package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Pt01 {//All work correct
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Jack", "Roy", "Rose"};
        double[] numbers = {2.0, 3, 4.9, 4.7, 2};

        sortArray(names);
        averageValue(numbers);
        ifNameToSearch(names);
        binarySearch(names);
    }

    public static void sortArray(String[] names){
        System.out.println("Do not sort:" + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted array:" + Arrays.toString(names));
    }

    public static void averageValue(double[] numbers){
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("The average values is: " + average);
    }

    public static void ifNameToSearch(String[] names) {
        System.out.println("Enter the name to search: ");
        String nameToSearch = SCANNER.nextLine();
        boolean found = false;
        for (var name : names) {
            if (name.equals(nameToSearch)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The name '" + nameToSearch + "' is on the list");
        } else {
            System.out.println("The name '" + nameToSearch + "' is not found");
        }
    }

    public static void binarySearch(String[] names) {
        System.out.println("Enter the name to search: ");
        String nameToSearch = SCANNER.nextLine();
        int ix = Arrays.binarySearch(names, nameToSearch);
        if (ix >= 0) {
            System.out.println("The name '" + nameToSearch + "' is on the list");
        } else {
            System.out.println("The name '" + nameToSearch + "' is not found");
        }
    }
}
