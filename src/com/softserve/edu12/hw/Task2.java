package com.softserve.edu12.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println("Enter number " + (i + 1) + " (must be between " + start + " and " + end + "): ");
                numbers[i] = readNumber(start, end, scanner);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Numbers entered:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static int readNumber(int start, int end, Scanner scanner) {
        int number;
        try {
            number = Integer.parseInt(scanner.nextLine());
            if (number < start || number > end) {
                throw new IllegalArgumentException("Number must be between " + start + " and " + end);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Enter a valid number.");
        }
        return number;
    }
}
