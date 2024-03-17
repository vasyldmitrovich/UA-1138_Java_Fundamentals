package com.softserve.edu04.pt;

import java.util.Scanner;

public class PracticalTask1 {//Ok

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int remainder;
        int count = 0;

        System.out.println("Enter first number: ");
        number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        number2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        number3 = scanner.nextInt();

        remainder = number1 % 2;
        if (remainder == 1) {
            count++;
        }

        remainder = number2 % 2;
        if (remainder == 1) {
            count++;
        }

        remainder = number3 % 2;
        if (remainder == 1) {
            count++;
        }
        System.out.println("There are " + count + " odd numbers");
    }
}
