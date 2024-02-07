package com.softserve.edu05.hw;

import java.util.Scanner;

public class HW5_02 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean condition = true;
        do {
            System.out.println("Please, enter the first number: ");
            int num1 = SCANNER.nextInt();
            System.out.println("Please, enter the second number: ");
            int num2 = SCANNER.nextInt();
            System.out.println("The sum is " + (num1 + num2));
            System.out.println("Would You like to continue? (y/n)");
            String answer = SCANNER.next();
            if ("n".equals(answer)) {
                condition = false;
            }
        } while (condition);
    }
}
