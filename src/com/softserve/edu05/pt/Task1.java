package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {//Good

    public static void main(String[] args) {

        String[] Dishes = {"Hamburger", "Hotdog", "Pizza", "Fried Chicken", "Macaroni and Cheese", "Barbecue Ribs", "Buffalo Wings", "Clam Chowder", "Apple Pie"};
        sortAndPrint(Dishes);


        int[] numbersArray = {9, 4, 6, 8, 1};
        double average = calculateAverage(numbersArray);
        System.out.println("Average value: " + average);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dish to search: ");
        String dishToFind = scanner.nextLine();
        boolean found = findElement(Dishes, dishToFind);
        System.out.println("Dish found: " + found);
    }


    public static void sortAndPrint(String[] array) {
        String[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }


    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return (double) sum / arr.length;
    }


    public static boolean findElement(String[] arr, String searchedElement) {
        for (String element : arr) {
            if (element.equalsIgnoreCase(searchedElement)) {
                return true;
            }
        }
        return false;
    }
}