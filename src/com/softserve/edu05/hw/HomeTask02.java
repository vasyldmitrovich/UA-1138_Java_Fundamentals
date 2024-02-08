package com.softserve.edu05.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class HomeTask02 {
    public static void main(String[] args) {

        boolean repeat;

        do {
            int number1 = input("Enter first number: ");
            int number2 = input("Enter second number: ");

            System.out.println("The sum of 2 numbers is " + sum(number1, number2));

            repeat = askForRepeat();
        } while (repeat);

    }

    private static boolean askForRepeat() {
        Scanner scan = new Scanner(in);
        System.out.println("Do you want to repeat? (yes/no)");
        String response = scan.nextLine().toLowerCase();
        return response.equals("yes");
    }

    private static int input(String s) {
        System.out.println(s);
        Scanner scan = new Scanner(in);
        return scan.nextInt();
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
