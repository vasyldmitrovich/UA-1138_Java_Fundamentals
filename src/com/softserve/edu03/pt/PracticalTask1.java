package com.softserve.edu03.pt;

import java.util.Scanner;

public class PracticalTask1 {

    static int number;
    static int sum;
    static double average;

    public static void main(String[] args) {

        int a = getNumber("Input the first number: ");
        int b = getNumber("Input the second number: ");
        System.out.println("The sum of " + a + " and " + b + " is " + getTotal(a, b));
        System.out.println("The average of " + a + " and " + b + " is " + getAverage(a, b));
    }

    static int getNumber(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        number = scanner.nextInt();
        return number;
    }

    static int getTotal(int a, int b) {
        sum = a + b;
        return sum;
    }

    static double getAverage(double a, double b) {
        average = (a + b) / 2;
        return average;
    }

}
