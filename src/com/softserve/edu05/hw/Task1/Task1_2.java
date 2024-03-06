package com.softserve.edu05.hw.Task1;

import java.util.Scanner;

public class Task1_2 {//Nice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Entered array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int result;
        boolean areFirstFivePositive = true;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] < 0) {
                areFirstFivePositive = false;
                break;
            }
        }

        if (areFirstFivePositive) {
            result = 0;
            for (int i = 0; i < 5; i++) {
                result += numbers[i];
            }
            System.out.println("\nThe sum of the first 5 positive numbers: " + result);
        } else {
            result = 1;
            for (int i = 5; i < 10; i++) {
                result *= numbers[i];
            }
            System.out.println("\nThe product of the last 5 numbers: " + result);
        }
    }
}