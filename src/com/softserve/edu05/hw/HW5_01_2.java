package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class HW5_01_2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please, enter the integer number: ");
            numbers[i] = SCANNER.nextInt();
        }
        System.out.println("The entered numbers are: " + Arrays.toString(numbers));
        calculation(numbers);
    }

    private static void calculation(int[] numbers) {
        boolean isFirstFivePositive = true;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] < 0) isFirstFivePositive = false;
        }

        if (isFirstFivePositive) {
            long sum = sum(numbers);
            System.out.println("The sum of first five positive elements is: " + sum);
        } else {
            long product = product(numbers);
            System.out.println("The product of last five elements is: " + product);
        }
    }

    private static long sum(int[] numbers) {
        long result = 0;
        for (int i = 0; i < 5; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    private static long product(int[] numbers) {
        long result = 1;
        for (int i = numbers.length - 1; i > numbers.length - 6; i--) {
            result = result * numbers[i];
        }
        return result;
    }
}


