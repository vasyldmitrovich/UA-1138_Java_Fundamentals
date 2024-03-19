package com.softserve.edu12.pt;

import java.util.Scanner;

public class Pt01 {
    public static void main(String[] args) {

        while (true) {
            try {
                int a = readInt("Enter side a: ");
                int b = readInt("Enter side b: ");

                int area = rectangleArea(a, b);
                System.out.println("The rectangle area is " + area);
                break;
            } catch (NumberFormatException ex){
                System.out.println("It should be a number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int readInt(String prompt){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex){
                System.out.println("It should be a number");
            }
        }
    }
    private static int rectangleArea(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("The sides should non negative");
        }
        return a * b;
    }
}
