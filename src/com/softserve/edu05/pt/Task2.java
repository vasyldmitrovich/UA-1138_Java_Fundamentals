package com.softserve.edu05.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void task2() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter a number: ");
        int number = Math.abs(scanner.nextInt());
        Task2.isPrime(number);

    }

    public static boolean isPrime(int number) {//Ok

        boolean isPrime = number != 1;

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }

        return isPrime;
    }
}
