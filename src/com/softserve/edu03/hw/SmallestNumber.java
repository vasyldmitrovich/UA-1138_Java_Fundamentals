package com.softserve.edu03.hw;

import java.util.Scanner;

public class SmallestNumber {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the first number:");
        int first = SCANNER.nextInt();

        System.out.println("Input the second number:");
        int second = SCANNER.nextInt();

        System.out.println("Input the third number:");
        int third = SCANNER.nextInt();

        int min = findMin(first, second, third);
        System.out.println("The smallest number is: " + min);
    }

    private static int findMin(int first, int second, int third) {//Good
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
