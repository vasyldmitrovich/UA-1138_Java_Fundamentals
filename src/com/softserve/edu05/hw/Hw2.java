package com.softserve.edu05.hw;

import java.util.Scanner;

public class Hw2 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void getSumOfTwoNumbers() {
        boolean repeate = false;
        do {
            System.out.println("Enter two numbers");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.println("The sum is " +  (first +second));
            System.out.println("Would you like to do it agan? (enter yes or not)");
            scanner.nextLine();
            String userAnswer = scanner.nextLine();
            repeate = userAnswer.equals("yes");
        } while (repeate);
    }
}
