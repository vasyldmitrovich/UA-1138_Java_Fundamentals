package com.softserve.edu03.hw;

import java.util.Scanner;

public class SmallestNumber {

    public static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The smallest number is: " + scan(s));
    }

    public static int scan(Scanner s) {
        System.out.println("Input the first number: ");
        double a = s.nextInt();
        System.out.println("Input the second number: ");
        double b = s.nextInt();
        System.out.println("Input the third number: ");
        double c = s.nextInt();

        return smallestNumber(a, b, c);
    }

    public static int smallestNumber(double a, double b, double c) {
        return (int) Math.min(Math.min(a, b), c);
    }
}
