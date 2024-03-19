package com.softserve.edu12.pt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the value of 'a' : ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the value of 'b': ");
            int b = Integer.parseInt(scanner.nextLine());

            int area = squareRectangle(a, b);
            System.out.println("Area of the rectangle: " + area);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for 'a' and 'b'");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Value of 'a' and 'b' must be positive ");
        }
        return a * b;
    }
}
