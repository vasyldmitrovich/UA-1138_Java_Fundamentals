package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class HW5_01_3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please, enter the integer number: ");
            numbers[i] = SCANNER.nextInt();
        }
        System.out.println("The entered numbers are: " + Arrays.toString(numbers));

        int indexOfSecondPositive = findIndexOfSecondPositive(numbers);
        if (indexOfSecondPositive < 0) {
            System.out.println("The positive number is only one or absent.");
        } else {
            System.out.println("The position of the second positive number is: " + indexOfSecondPositive);
        }

        int indexOfMinimumValue = findIndexOfMinimumValue(numbers);
        System.out.println("The minimum value is: " + numbers[indexOfMinimumValue]);
        System.out.println("The position of minimum value is: " + indexOfMinimumValue);


        System.out.println("The product of even numbers is: " + productOfEvenNumbers(numbers));
    }

    public static int findIndexOfSecondPositive(int[] numbers) {
        int position = -1;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) count++;
            if (count == 2) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static int findIndexOfMinimumValue(int[] numbers) {
        int position = 0;
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                position = i;
                min = numbers[i];
            }
        }
        return position;
    }

    public static long productOfEvenNumbers(int[] numbers) {
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                result = result * numbers[i];
            }
        }
        return result;
    }
}

