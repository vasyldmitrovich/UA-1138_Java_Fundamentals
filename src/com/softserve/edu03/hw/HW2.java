package com.softserve.edu03.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class HW2 {
    public static void main(String... args) {
        int first = getNumber("Input the first number: ");
        int second = getNumber("Input the second number: ");
        int third = getNumber("Input the third number: ");
        double smallest = getSmallest(first, second, third);
        System.out.println("The smallest number is " + smallest);

    }


    private static double getSmallest(int first, int second, int third) {
        return Math.min(Math.min(first, second), third);
    }

    private static int getNumber(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(in);
        return Integer.parseInt(scanner.nextLine());

    }


}


