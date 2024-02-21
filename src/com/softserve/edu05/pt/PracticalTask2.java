package com.softserve.edu05.pt;

import java.util.Scanner;

public class PracticalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num = scanner.nextInt();
        boolean count = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0 && count == true) {
                System.out.println("Is a prime number");
                break;
            } else if (count == true) {
                count = false;
                System.out.println("Is not prime number");
            }
        }
    }
}
