package com.softserve.edu05.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class Pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        if (isPrime(number)){
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not prime");
        }
    }

    public static boolean isPrime(int number){
        if (number < 0) number = -number;
        if (number == 1) return false;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
