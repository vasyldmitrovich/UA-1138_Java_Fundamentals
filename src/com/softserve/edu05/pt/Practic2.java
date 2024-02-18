package com.softserve.edu05.pt;

import java.util.Scanner;

public class Practic2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
