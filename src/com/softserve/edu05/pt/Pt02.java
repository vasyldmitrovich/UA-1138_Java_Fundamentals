package com.softserve.edu05.pt;

import java.util.Scanner;

public class Pt02 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = SCANNER.nextInt();
        if (isPrime(number)) {//This is nice, cool
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not prime");
        }

    }

    public static boolean isPrime(int number) {
        boolean res = true;
        if (number < 0) number = -number;
        if (number == 1) return false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}