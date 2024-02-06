package com.softserve.edu03.pt;

import java.util.Scanner;

public class PrTask1 {
    public static void main(String[] args) {//All is good
        int first = getNumbers("Enter the first number: ");
        int second = getNumbers("Enter the second number: ");


        int sum = getTotal(first, second);
        double average = getAverage(first, second);
        System.out.println("The sum of " + first + " and " + second + " = " + sum);
        System.out.println("The average of " + first + " and " + second + " = " + average);
    }

    private static int getNumbers(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());

    }

    private static double getAverage(int first, int second) {
        return getTotal(first, second) / 2.0;
    }

    private static int getTotal(int first, int second) {
        return first + second;
    }
}

