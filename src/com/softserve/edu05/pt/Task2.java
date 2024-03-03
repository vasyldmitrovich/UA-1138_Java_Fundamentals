package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = Math.abs(scanner.nextInt());
        boolean isPrimeNumber = isPrime(number);
        System.out.println("Is " + number + " a prime number? " + isPrimeNumber);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}