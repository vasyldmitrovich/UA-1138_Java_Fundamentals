package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class PrTask3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-20, 20);
        }
        System.out.println("Generated array:" + Arrays.toString(arr));

        int max = getMax(arr);
        System.out.println("The biggest number in the array: " + max);

        int countNeg = countNegativeNumbers(arr);
        System.out.println("Number of negative numbers: " + countNeg);

        int sum = getSum(arr);
        System.out.println("The sum of positive numbers: " + sum);

        int countPos = countPositiveNumbers(arr);

        checkMore(countNeg, countPos);
    }

    private static void checkMore(int countNeg, int countPos) {
        if (countNeg == countPos) {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
        if (countNeg < countPos) {
            System.out.println("There are more positive values in the array");
        }
        if (countNeg > countPos) {
            System.out.println("There are more negative values in the array");
        }
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int countNegativeNumbers(int[] arr) {
        int countNeg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                countNeg++;
            }
        }
        return countNeg;
    }

    private static int countPositiveNumbers(int[] arr) {
        int countPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPos++;
            }
        }
        return countPos;
    }
}
