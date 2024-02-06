package com.softserve.edu03.pt;

import java.util.Scanner;

public class Task1 {
    public static void main(String... args) {
        int int1 = getNumber("Enter first number: ");
        int int2 = getNumber("Enter second number: ");
        int sum = getTotal(int1, int2);
        double average = getAverage(int1, int2);
        System.out.println("The sum of " + int1 + " and " + int2 + " is " + sum);
        System.out.println("The average of " + int1 + " and " + int2 + " is " + average);
    }

    public static int getNumber(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getTotal(int int1, int int2) {
        return int1 + int2;
    }

    public static double getAverage(int int1, int int2) {
        return (int1 + int2) / 2.0;
    }//Ok
}