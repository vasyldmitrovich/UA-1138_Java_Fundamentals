package com.softserve.edu05.pt;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = generateRandomNumbers(15);

        int max = findMaxValue(array);
        System.out.println("The largest number in the array is: " + max);

        long sum = calculateSumOfPositives(array);
        System.out.println("The sum of positive numbers in the array is: " + sum);

        int countNegatives = countNegatives(array);
        System.out.println("The count of negative numbers in the array is: " + countNegatives);

        String result = checkIsMoreNegativeOrPositive(array);
        System.out.println(result);
    }

    public static int[] generateRandomNumbers(int quantity) {
        Random random = new Random();
        int[] array = new int[quantity];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100; // Generating numbers between -100 and 100
        }
        return array;
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static long calculateSumOfPositives(int[] arr) {
        long sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int countNegatives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }

    public static String checkIsMoreNegativeOrPositive(int[] arr) {
        int countPositives = countPositives(arr);
        int countNegatives = countNegatives(arr);

        if (countNegatives > countPositives) {
            return "There are more negative values in the array.";
        } else if (countPositives > countNegatives) {
            return "There are more positive values in the array.";
        } else {
            return "There are an equal number of positive and negative values in the array.";
        }
    }

    public static int countPositives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }
}