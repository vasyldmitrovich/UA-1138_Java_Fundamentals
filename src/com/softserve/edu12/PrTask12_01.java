package com.softserve.edu12;

import java.util.Scanner;

public class PrTask12_01 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter side a: ");
                int a = Integer.parseInt(scan.nextLine());
                System.out.println("Enter side b: ");
                int b = Integer.parseInt(scan.nextLine());

                int area = rectangleArea(a, b);
                System.out.println("The rectangle area is " + area);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int rectangleArea(int a, int b) {
        if (a < 0 | b < 0) {
            throw new IllegalArgumentException(
                    "The sides should be non negative"
            );
        }
        return a * b;
    }
}