package com.softserve.edu03.hw;

import java.util.Scanner;

public class Homework1 {

    public static Scanner scanner = new Scanner(System.in);
    private static double a;
    private static double b;
    private static double c;
    private double p;
    private double area;

    public static void main(String[] args) {
        Homework1 sides = new Homework1();
        sides.getSides();
        Homework1 area = new Homework1();
        area.getArea();
    }

    public void getSides() {
        System.out.println("Input first side: ");
        a = scanner.nextDouble();
        System.out.println("Input second side: ");
        b = scanner.nextDouble();
        System.out.println("Input third side: ");
        c = scanner.nextDouble();
    }

    public void getArea() {
        p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(area);
    }
}




/**/