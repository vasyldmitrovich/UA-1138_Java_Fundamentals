package com.softserve.edu12.pt.task1;

import java.util.Scanner;

public class PrTask1 {
    public static void main(String[] args) {
        while (true) {
            try {
                int a = readInt("Enter side a:");
                int b = readInt("Enter side b:");
                int area = rectangleArea(a, b);
                System.out.println("The rectangle area is " + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int readInt(String prompt) {
        var scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number: ");
            }
        }
    }

    public static int rectangleArea(int a, int b) {
        if (a < 0 | b < 0) {
            throw new IllegalArgumentException("The side should be non negative");
        }
        return a * b;
    }
}
