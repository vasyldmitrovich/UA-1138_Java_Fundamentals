package com.softserve.edu12.PT;

import java.util.Scanner;

import static java.lang.System.in;

public class pt01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        while (true) {
            try {
                System.out.println("Enter side a ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter side b ");
                int b = Integer.parseInt(scanner.nextLine());
                int area = rectangleArea(a, b);
                System.out.println("Area is " + area);
                break;
            } catch (NumberFormatException e) {
                System.out.println("This is not a number");
            }
        }


    }

    public static int rectangleArea(int a, int b) {
        if (a < 0 | b < 0) {
            throw new IllegalArgumentException("Size should be not negative");
        }
        return a * b;
    }
}
