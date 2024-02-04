package com.softserve.edu04.hw;

import java.util.Scanner;

public class HW04_02 {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the first number: ");
        int first = SCANNER.nextInt();

        System.out.println("Input the second number: ");
        int second = SCANNER.nextInt();

        System.out.println("Input the third number: ");
        int third = SCANNER.nextInt();

        int min = findMin(first, second, third);
        System.out.println("The minimum value is: " + min);

        int max = findMax(first, second, third);
        System.out.println("The maximum value is: " + max);
    }

    private static int findMax(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }

        return max;
    }

    private static int findMin(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }

        return min;
    }
}
