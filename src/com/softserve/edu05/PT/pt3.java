package com.softserve.edu05.PT;

import java.util.Arrays;
import java.util.Random;


public class pt3 {
    public static void main(String... args) {
        int[] arr = randomNumbers(10);

        System.out.println(Arrays.toString(arr));
        System.out.println("The biggest number is " + max(arr));
        System.out.println("The sum of positive numbers is " + sum(arr));
        System.out.println("The count of negative numbers is " + countNegatives(arr));

        int countPositives = countPositives(arr);
        int countNegatives = countNegatives(arr);
        if (countNegatives(arr) > countPositives(arr)) {
            System.out.println("There are more negative values in the array");
        } else if (countNegatives(arr) < countPositives(arr)) {
            System.out.println("There are more positive values in the array");
        } else
            System.out.println("There are an equal number of positive and negative values in the array.");

    }

    static int[] randomNumbers(int quantity) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 10);

        }
        return arr;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0)
                sum += i;
        }
        return sum;

    }

    static int countNegatives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0)
                count++;
        }
        return count;
    }

    static int countPositives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0)
                count++;
        }
        return count;
    }
}