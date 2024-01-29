package com.softserve.edu03.pt;

import java.util.Scanner;

public class JavaConsoleApp {
    public static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        getNumber(s);
    }

    public static void getNumber(Scanner s) {
        System.out.println("Enter the first number: ");
        double firstNum = s.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNum = s.nextDouble();

        System.out.println("The sum of " + firstNum + " and " + secondNum
                + " is " + getTotal(firstNum, secondNum));

        System.out.println("The average of " + firstNum + " and " + secondNum
                + " is " + getAverage(firstNum, secondNum));
    }

    public static double getTotal(double a, double b) {
        return a + b;
    }

    public static double getAverage(double a, double b) {
        return (a + b) / 2.0;
    }
}
