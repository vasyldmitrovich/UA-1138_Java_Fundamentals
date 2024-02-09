package com.softserve.edu05.pt;

import java.util.Random;

public class Task3 {
    public static void task3() {
        int[] array = generateRandomNumbers(10);

        // Output the biggest number in the array
        Task3.getMaxValue(array);

        // Output the sum of positive numbers
        Task3.sumOfPositives(array);

        // Output count the number of negative numbers.
        Task3.countOfNegatives(array);

        // determine whether there are more negative or positive values in the array.
        Task3.checkIsMoreNegativeOrPositive(array);

    }

    public static int[] generateRandomNumbers(int quantity) {
        Random random = new Random();
        int[] array = new int[quantity];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
        return array;
    }

    public static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max value is: " + max);
        return max;
    }

    public static long sumOfPositives(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        System.out.println("The sum of positive values: " + sum);
        return sum;
    }

    public static int countOfPositives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOfNegatives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        System.out.println("The number of negative values: " + count);
        return count;
    }

    public static String checkIsMoreNegativeOrPositive(int [] arr) {
        int countPositives = countOfPositives(arr);
        int countNegatives = countOfNegatives(arr);

        String output;

        if (countNegatives > countPositives) {
            output = "There are more negative values in the array.";
        } else if (countPositives > countNegatives) {
            output = "There are more positive values in the array.";
        } else {
            output = "There are an equal number of positive and negative values in the array.";
        }
        System.out.println(output);
        return output;
    }
}
