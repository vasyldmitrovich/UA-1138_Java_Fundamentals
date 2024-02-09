package com.softserve.edu03.hw.Task1;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        double firstSide = getValueSide("Input the first side: ");
        double secondSide = getValueSide("Input the second side: ");
        double thirdSide = getValueSide("Input the third side: ");
        double area = calculateArea(firstSide, secondSide, thirdSide);
        System.out.println("Area of triangle is " + area);
    }

    private static double getValueSide(String messageToUser) {
        System.out.println(messageToUser);
        Scanner scan = new Scanner(in);
        return Double.parseDouble(scan.nextLine());
    }

    private static double calculateArea(double firstSide, double secondSide, double thirdSide) {//Nice
        double halfPerimeter = (firstSide + secondSide + thirdSide) / 2.0;
        double square = Math.sqrt(halfPerimeter * ((halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide)));
        return square;
    }
}
