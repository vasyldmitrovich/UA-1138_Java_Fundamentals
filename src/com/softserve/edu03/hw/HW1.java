package com.softserve.edu03.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class HW1 {
    public static void main(String... args) {
        int a = getNumber("Enter side 1: ");
        int b = getNumber("Enter side 2: ");
        int c = getNumber("Enter side 3: ");
        double sum = getSum(a, b, c);//You do not use variable sum, please print result to console
        double S = getS(a, b, c);
        double area = Math.sqrt(S * (S - a) * (S - b) * (S - c));
        System.out.println("The area of triangle is " + area);

    }

    private static double getS(int a, int b, int c) {
        return getSum(a, b, c) / 2;
    }

    private static double getSum(int a, int b, int c) {
        return a + b + c;
    }

    private static int getNumber(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(in);
        return Integer.parseInt(scanner.nextLine());

    }


}


