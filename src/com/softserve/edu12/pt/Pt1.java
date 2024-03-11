package com.softserve.edu12.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class Pt1 {
    public static void main(String[] args) {
        while (true) {
            try {
                int a = readInt("Enter a side a: ");
                int b = readInt("Enter a side b: ");

                int area = rectangleArea(a , b);
                System.out.println("the rectangle area is " + area);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int readInt(String prompt) {
        Scanner scanner = new Scanner(in);
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number");
            }
        }
    }

    public static int rectangleArea(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException(
                    "The sides should be non negative"
            );
        }
        return a * b;
    }
}
