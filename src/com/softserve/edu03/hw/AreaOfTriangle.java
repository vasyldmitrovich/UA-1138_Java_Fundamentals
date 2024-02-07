package com.softserve.edu03.hw;

import java.util.Scanner;

public class AreaOfTriangle {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {//Good
        System.out.println("Input Side 1:");
        double side1 = SCANNER.nextDouble();

        System.out.println("Input Side 2:");
        double side2 = SCANNER.nextDouble();

        System.out.println("Input Side 3:");
        double side3 = SCANNER.nextDouble();

        double area = calculateArea(side1, side2, side3);
        System.out.println("The area of the triangle is: " + area);
    }

    private static double calculateArea(double a, double b, double c) {//Ok
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
