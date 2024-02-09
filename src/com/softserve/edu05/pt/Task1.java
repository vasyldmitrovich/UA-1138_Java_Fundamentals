package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Task1 {
    public static void task1() {

        // Sort array
        String[] stringArray = {"G", "2A", "1A", "F", "B", "EB", "D", "EA", "C"};
        Task1.sort(stringArray);

        // Get average value
        int[] numbersArray = {5, 3, 7, 3, 2};
        Task1.getAverageValue(numbersArray);

        // Find element
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the value you want to search: ");
        String valueToFind = scanner.nextLine();
        Task1.findElementInTheArray(stringArray, valueToFind);
    }

    public static String[] sort(String[] array) {
        String[] arrayToSort = array.clone();
        Arrays.sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
        return arrayToSort;
    }

    public static double getAverageValue(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        double average = sum / (double) arr.length;
        System.out.println(average);
        return average;
    }

    public static boolean findElementInTheArray(String[] arr, String searchedElement) {
        boolean isFound = false;
        for (var element : arr) {
            if (element.equals(searchedElement)) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);
        return isFound;
    }
}