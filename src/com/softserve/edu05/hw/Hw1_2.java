package com.softserve.edu05.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class Hw1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int product = 1;
        int countPositives = 0;
        int countNotPositive = 0;

        for (int num : numbers) {
            if (num > 0 && countPositives < 5) {
                sum += num;
                countPositives++;
            } else if (countNotPositive < 5) {
                product *= num;
                countNotPositive++;
            }
        }

        if (countPositives == 5) {
            System.out.println("Sum of the first five positive numbers: " + sum);
        } else {
            System.out.println("Product of the last five not positive numbers: " + product);
        }
    }
}
