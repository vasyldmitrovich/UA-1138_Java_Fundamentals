package com.softserve.edu05.hw.Hw1;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void task2() {
        Scanner scanner = new Scanner(in);

        // Task 1_2
        System.out.println("Enter 10 integers numbers: ");
        int[] arrayTenNumbers = new int[10];
        for (int i = 0; i < arrayTenNumbers.length; i++) {
            arrayTenNumbers[i] = scanner.nextInt();
        }
        Task2.calculateArray(arrayTenNumbers);
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

        if (isFirstFivePositive) {
            for (int i = 0; i < 5; i++) {
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
}
