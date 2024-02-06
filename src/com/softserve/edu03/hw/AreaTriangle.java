package com.softserve.edu03.hw;

import java.util.Scanner;

public class AreaTriangle {

    public static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The area of the triangle is: " + scan(s));//Nice very nice
    }

    public static double scan(Scanner s) {
        System.out.println("Input side 1: ");
        double a = s.nextDouble();
        System.out.println("Input side 2: ");
        double b = s.nextDouble();
        System.out.println("Input side 3: ");
        double c = s.nextDouble();

        return formulaGerona(a, b, c);
    }

    public static double formulaGerona(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
