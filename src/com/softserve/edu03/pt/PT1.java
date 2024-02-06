package com.softserve.edu03.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class PT1 {
    public static void main(String... args) {
        int first = getNumber("Enter the first number: ");
        int second = getNumber("Enter the second number: ");
        int sum = getTotal(first, second);
        double average = getAvarage(first, second);
        System.out.println("The sum of " + first + " and " + second + " is " + sum);
        System.out.println("The avarage of " + first + " and " + second + " is " + average);
    }

    private static int getNumber(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(in);
        return Integer.parseInt(scanner.nextLine());

    }

    private static double getAvarage(int first, int second) {
        return getTotal(first, second) / 2.0;
    }

    private static int getTotal(int first, int second) {
        return first + second;
    }
}
