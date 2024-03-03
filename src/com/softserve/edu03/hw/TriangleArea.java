package com.softserve.edu03.hw;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TriangleArea {
    public static void main(String... args){
        int side1 = getInput("Input side 1: ");
        int side2 = getInput("Input side 2: ");
        int side3 = getInput("Input side 3: ");

        System.out.println("The area of triangle is " + triangleArea(side1, side2, side3));//You can call this method here
    }

    private static double triangleArea(int side1, int side2, int side3) {//Good
        double p = (side1 + side2 + side3) / 2.0;
        return sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    private static int getInput(String s) {
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
