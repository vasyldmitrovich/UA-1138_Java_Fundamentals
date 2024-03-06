package com.softserve.edu05.hw.Task1;

import java.util.Scanner;

public class Task1_3 {//Nice very nice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integer numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int secondPositiveIndex = findSecondPositiveIndex(numbers);
        int min = findMinValue(numbers);
        int minIndex = findMinIndex(numbers);
        int evenProduct = calculateEvenProduct(numbers);

        System.out.println("Position of second positive number: " + secondPositiveIndex);
        System.out.println("Minimum value: " + min + ", Position: " + minIndex);
        System.out.println("Product of all entered even numbers (excluding 0): " + evenProduct);
    }

    private static int findSecondPositiveIndex(int[] numbers) {
        int positiveCount = 0;
        int index = -1;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    index = i + 1;
                    break;
                }
            }
        }
        return index;
    }

    private static int findMinValue(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int findMinIndex(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i + 1;
            }
        }
        return minIndex;
    }

    private static int calculateEvenProduct(int[] numbers) {
        int product = 1;
        for (int num : numbers) {
            if (num != 0 && num % 2 == 0) {
                product *= num;
            }
        }
        return product;
    }
}