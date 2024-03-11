package com.softserve.edu12.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class Hw2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int number = readNumber(1, 100, "Enter number " + i + ": ");
            System.out.println("Number " + i + " is in the range");
        }
    }


    public static int readNumber(int start, int end, String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt);
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= start && number <= end) {
                    return number;
                } else {
                    throw new IllegalArgumentException("The number is out of range");
                }
            } catch (NumberFormatException e) {
                System.out.println("It should be a number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
