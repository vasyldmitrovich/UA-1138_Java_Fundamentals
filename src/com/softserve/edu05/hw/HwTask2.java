package com.softserve.edu05.hw;

import java.util.Scanner;

public class HwTask2 {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        do {
            System.out.println("Enter 'y' if you want to enter numbers, and 'n' if not: ");
            s = SCANNER.nextLine();
            if (s.equals("y")) {
                System.out.println("Enter the first number:");
                int number1 = Integer.parseInt(SCANNER.nextLine());
                System.out.println("Enter the first number:");
                int number2 = Integer.parseInt(SCANNER.nextLine());
                System.out.println("The sum of the numbers is: " + (number1 + number2));
            }
        } while (!s.equals("n"));
    }
}
