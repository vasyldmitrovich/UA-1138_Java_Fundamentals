package com.softserve.edu12.hw.task2;

import java.util.Scanner;

public class HwTask2 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[10];
            int previousNumber = 0;
            for (int i = 0; i < 10; i++) {
                numbers[i] = readNumber(previousNumber + 1, 100);
                previousNumber = numbers[i];
            }

            System.out.println("Result:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number between " + start + " and " + end);
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= start && number <= end) {
                    return number;
                } else {
                    System.out.println("Number must be between " + start + " and " + end + ". Try again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
            }
        }

    }
}
