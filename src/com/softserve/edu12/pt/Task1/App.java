package com.softserve.edu12.pt.Task1;

import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void main(String[] args) {

        while (true) {
            try {
                int a = getNinNegativeNumberFromConsole("Enter side a ");
                int b = getNinNegativeNumberFromConsole("Enter side b ");

                int area = rectangleArea(a,b);
                System.out.println("Area is " + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int getNinNegativeNumberFromConsole(String prompt) {
        Scanner scanner = new Scanner(in);
        while (true) {
            try {
                System.out.println(prompt);
                int number = Integer.parseInt(scanner.nextLine());
                if(number < 0) {
                    System.out.println("Should be non negative");
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("This is not a number");
            }
        }
    }

    public static int rectangleArea(int a, int b) {
        if(a < 0 | b < 0) {
            throw new IllegalArgumentException("Sides should be not negative");
        }
        return a * b;
    }
}
