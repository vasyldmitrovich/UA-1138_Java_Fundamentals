package com.softserve.edu05.HW;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int secondPositivePosition = -1;
        int min = numbers[0];
        int minPosition = 0;
        int even = 1;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                if (secondPositivePosition == -1) {
                    secondPositivePosition = i + 1;
                }
            }

            if (numbers[i] < min) {
                min = numbers[i];
                minPosition = i + 1;
            }

            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                even *= numbers[i];
            }
        }

        System.out.println("Position of second positive number " + secondPositivePosition);
        System.out.println("Minimum value " + min + "; Position " + minPosition);
        System.out.println("Product of even numbers " + even);
    }
}


