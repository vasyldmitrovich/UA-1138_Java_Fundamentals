package com.softserve.edu12.hw;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask02 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] integers = new Integer[3];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = readNumber(5, 50);
            try {
                if (i > 0 && integers[i] <= integers[i - 1]) {
                    throw new IllegalArgumentException("The value should be bigger than " + integers[i - 1]);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        System.out.println(Arrays.toString(integers));
    }


    public static int readNumber(int start, int end) {
        int number;
        while (true) {
            try {
                number = inputNumber("Enter the number: ");
                if ((number < start) | (number > end)) {
                    throw new OutOfRangeException("The number is out of the range.");
                }
                return number;
            } catch (OutOfRangeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int inputNumber(String prompt) {
        System.out.println(prompt);
        int number;
        while (true) {
            try {
                number = Integer.parseInt(scan.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("This is not a number.");
            }
        }
    }
}
