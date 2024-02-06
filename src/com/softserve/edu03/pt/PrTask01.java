package com.softserve.edu03.pt;

import java.util.Scanner;

public class PrTask01 {
    public static void main(String[] args) {
        int first = getNumber("Enter the first number: ");
        int second = getNumber("Enter the second number: ");
        int sum = getTotal(first, second);
        double average = getAverage(first, second);
        System.out.println("The sum of " + first +
                " and " + second + " is " + sum);
        System.out.println("The average of " + first +
                " and " + second + " is " + average);
    }

    private static int getNumber(String prompt) {//This is good
        System.out.print(prompt);
        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.nextLine());
    }

    private static double getAverage(int first, int second) {
        return getTotal(first, second) / 2.0;
    }

    private static int getTotal(int first, int second) {
        return first + second;
    }

}
