package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class PrTask5_03 {
    public static void main(String[] args) {
        int[] arr = generateRandomNumbers(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("The max value is " + max(arr));
        System.out.println("The sum of positive values is " + sumOfPositive(arr));
        int numberOfNegatives = numberOfNegatives(arr);
        System.out.println("The count of negative numbers is " + numberOfNegatives);

        int numberOfPositives = numberOfPositives(arr);

        if (numberOfNegatives > numberOfPositives) {
            System.out.println("There are more negative values in the array");
        } else if (numberOfPositives > numberOfNegatives) {
            System.out.println("There are more positive values in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }

    static int[] generateRandomNumbers(int quantity) {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-99, 100);
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

    static long sumOfPositive(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int numberOfNegatives(int[] arr) {
        int neg = 0;
        for (int i : arr) {
            if (i < 0) {
                neg++;
            }
        }
        return neg;
    }

    static int numberOfPositives(int[] arr) {
        int pos = 0;
        for (int i : arr) {
            if (i >= 0) {
                pos++;
            }
        }
        return pos;
    }

}



