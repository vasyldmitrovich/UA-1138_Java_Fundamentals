package com.softserve.edu12.hw.Task2;

import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static Scanner scanner = new Scanner(in);
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            readNumber(1,10);
        }
    }

    public static int readNumber(int start, int end) {
        while (true) {
            try {
                System.out.println("Enter a number in a range from " + start + " to " + end + ": ");
                int number = Integer.parseInt(scanner.nextLine());
                if(number >= start && number <= end) {
                    return number;
                } else {
                    throw new IllegalArgumentException("The number should be in a range from " + start + " to " + end);
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid value. Not a number");
            } catch (IllegalArgumentException e) {
                System.err.println("Invalid value. " + e.getMessage());
            }
        }
    }

}
