package com.softserve.edu05.hw.Hw1;

import java.util.Scanner;

import static java.lang.System.in;

public class Task3 {//Good very good
    public static void task3() {
        Scanner scanner = new Scanner(in);

        System.out.println("Enter 5 integers numbers: ");
        int[] arrayFiveNumbers = new int[5];

        for (int i = 0; i < arrayFiveNumbers.length; i++) {
            arrayFiveNumbers[i] = scanner.nextInt();
        }

        // Task 1_3_1
        Task3.getSecondPositiveNumberPosition(arrayFiveNumbers);

        // Task 1_3_2
        Task3.getMinValueAndPosition(arrayFiveNumbers);

        // Task 1_3_3
        Task3.getProductOfEvenNumbers(arrayFiveNumbers);
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
            if(el%2 == 0 && el != 0) {
                isAllPositive = el > 0; // check if the array has negative number
                productOfEvenNumbers *= el;

            }
        }
        return isAllPositive ? productOfEvenNumbers : productOfEvenNumbers * -1;
    }
}
