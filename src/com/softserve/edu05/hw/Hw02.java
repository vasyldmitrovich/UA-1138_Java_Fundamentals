package com.softserve.edu05.hw;

import java.util.Scanner;

public class Hw02 {//Nice
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        cycle();
    }

    public static void cycle() {
        boolean rep;

        do {

            System.out.println("Sum: " + input());
            rep = repeat();
        } while (rep);
    }

    public static boolean repeat() {
        System.out.println("Repeat yes or no: ");
        SCANNER.nextLine();
        String choice = SCANNER.nextLine().toLowerCase();
        return choice.equals("yes");
    }

    public static int input() {
        System.out.println("Input first number: ");
        int a = SCANNER.nextInt();
        System.out.println("Input second number: ");
        int b = SCANNER.nextInt();

        return sum(a, b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
