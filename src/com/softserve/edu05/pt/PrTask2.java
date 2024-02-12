package com.softserve.edu05.pt;

import java.util.Scanner;

public class PrTask2 {//Nice
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = SCANNER.nextInt();
        if (isPrime(number)) {
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not prime");
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) return false;
        for (int i = 2; i <= number - 1; i++) {
            if (number % 2 == 0) return false;
        }
        return true;
    }
}
