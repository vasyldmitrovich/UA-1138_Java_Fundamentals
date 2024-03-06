package com.softserve.edu12.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class PrTask01 {
    public static void main(String[] args) {
        while (true) {
            try {//Really nice. Good
                int length = getNonNegativeIntFromConsole("Enter the length: ");
                int width = getNonNegativeIntFromConsole("Enter the width: ");

                int area = rectangleArea(length, width);
                System.out.println("The area of rectangle: " + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    private static int getNonNegativeIntFromConsole(String prompt) {//Ok
        Scanner scan = new Scanner(in);
        while (true) {
            try {
                System.out.println(prompt);
                int a = Integer.parseInt(scan.nextLine());
                if (a < 0) {
                    System.out.println("It should be non negative number");
                    continue;
                }
                return a;
            } catch (NumberFormatException e) {
                System.out.println("This is not a number");
            }
        }
    }

    private static int rectangleArea(int side1, int side2) {//Very good
        if (side1 < 0 | side2 < 0) {
            throw new IllegalArgumentException("Side should be non negative");
        }
        return (side1 * side2);
    }
}
