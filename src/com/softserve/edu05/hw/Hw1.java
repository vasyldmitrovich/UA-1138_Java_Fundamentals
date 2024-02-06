package com.softserve.edu05.hw;

import java.util.Scanner;

public class Hw1 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void task1() {
        // Task 1_1
        System.out.println("Enter the month number");

        int monthNumber = scanner.nextInt();
        Hw1.getNumberOfDaysInMonth(monthNumber);

        // Task 1_2
        System.out.println("Enter 10 integers numbers: ");
        int[] arrayTenNumbers = new int[10];
        for (int i = 0; i < arrayTenNumbers.length; i++) {
            arrayTenNumbers[i] = scanner.nextInt();
        }
        Hw1.calculateArray(arrayTenNumbers);

        // Task 1_3
        System.out.println("Enter 5 integers numbers: ");
        int[] arrayFiveNumbers = new int[5];

        for (int i = 0; i < arrayFiveNumbers.length; i++) {
            arrayFiveNumbers[i] = scanner.nextInt();
        }

        // Task 1_3_1
        Hw1.getSecondPositiveNumberPosition(arrayFiveNumbers);

        // Task 1_3_2
        Hw1.getMinValueAndPosition(arrayFiveNumbers);

        // Task 1_3_3
        Hw1.getProductOfEvenNumbers(arrayFiveNumbers);
    }

    public static int getNumberOfDaysInMonth(int monthNumber) {
        int[] numberOfDaysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("Invalid month");
            return 0;
        } else {
            System.out.println("This month has " + numberOfDaysInMonth[monthNumber - 1] + " days.");
            return numberOfDaysInMonth[monthNumber - 1];
        }
    }

    public static long calculateArray(int[] array) {
        long result = 0;

        boolean isFirstFivePositive = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && i < 5) {
                isFirstFivePositive = false;
                break;
            }
        }

        if(isFirstFivePositive) {
            for (int i = 0; i <5; i++) {
                result += array[i];
            }
        } else {
            result = 1;
            for (int i = 5; i < array.length; i++) {
                result *= array[i];
            }
        }

        return result;
    }


    public static int getSecondPositiveNumberPosition(int[] array) {
        int secondPositiveNumberPosition = 0; // 0 - if was not found
        for (int i = 0; i < array.length -1; i++) {
            if(array[i] > 0 && (array[i+1] > 0)) {
                    secondPositiveNumberPosition = i+1;
                    break;
            }
        }
        return secondPositiveNumberPosition;
    }

    public static int[] getMinValueAndPosition (int[] array) {
        int minValue = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                position = i;
            }
        }
        return new int[]{minValue, position};
    }

    public static int getProductOfEvenNumbers (int[] array) {
        int productOfEvenNumbers = 1;
        boolean isAllPositive = true;

        for (int el: array) {
            if(el%2 == 0) {
                isAllPositive = el > 0; // check if the array has negative number
                productOfEvenNumbers *= el;

            }
        }
        return isAllPositive ? productOfEvenNumbers : productOfEvenNumbers*-1;
    }
}
