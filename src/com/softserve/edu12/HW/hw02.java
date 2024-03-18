package com.softserve.edu12.HW;

import java.util.Scanner;

import static com.softserve.edu01.hw.App.scanner;


public class hw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int previousNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = readNumber(previousNumber + 1, 100);
                previousNumber = numbers[i];

            } catch (NumberOutOfRangeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Entered numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

    }

    public static int readNumber(int start, int end) throws NumberOutOfRangeException {
        System.out.printf("Enter a number between " + start + " end " + end);
        int number = scanner.nextInt();


        if (number < start || number > end) {
            throw new NumberOutOfRangeException("Number must be between " + start + " and " + end);
        }

        return number;
    }
}

