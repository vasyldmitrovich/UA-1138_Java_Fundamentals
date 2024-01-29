package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base:");
        double b = scanner.nextDouble();
        System.out.println("Enter the height:");
        double h = scanner.nextDouble();
        System.out.println("Enter the additional side: ");
        double s = scanner.nextDouble();
        double area = calculateTriangleArea(b, h, s);
        System.out.println("The area of the triangle is: " + area);
    }

    public static double calculateTriangleArea(double b, double h, double s) {
        double p = (b + s + h) / 2.0;
        double area = Math.sqrt(p * (p - b) * (p - h) * (p - s));
        return area;
    }
}