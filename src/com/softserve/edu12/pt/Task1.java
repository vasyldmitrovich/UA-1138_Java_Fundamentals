package com.softserve.edu12.pt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while (true) {
            try {
                int length = getNonNegativeIntFromConsole("Enter the length of the rectangle: ");
                int width = getNonNegativeIntFromConsole("Enter the width of the rectangle: ");

                int area = rectangleArea(length, width);
                System.out.println("The area of the rectangle: " + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int getNonNegativeIntFromConsole(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(prompt);
                int number = Integer.parseInt(scanner.nextLine());
                if (number < 0) {
                    System.out.println("It should be a non-negative number.");
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Number expected.");
            }
        }
    }

    private static int rectangleArea(int side1, int side2) {
        if (side1 < 0 || side2 < 0) {
            throw new IllegalArgumentException("Side lengths should be non-negative.");
        }
        return side1 * side2;
    }
}
