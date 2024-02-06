package com.softserve.edu05.hw;

import java.util.Scanner;

public class HwTask1_2 {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(SCANNER.nextLine());

        }
        System.out.println("Введений масив: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        int sum = 0;
        int prod = 1;
        boolean ifSum = true;
        for (int i = 0; i < 5; i++) {
            if (arr1[i] < 0) {
                ifSum = false;
                break;
            }
            sum += arr1[i];
        }
        System.out.println();
        if (ifSum) {
            System.out.println("The sum of first first 5 positive numbers: " + sum);
        } else {
            for (int i = 5; i < 10; i++) {
                prod *= arr1[i];
            }
            System.out.println("The product of last 5  numbers: " + prod);
        }
    }
}

