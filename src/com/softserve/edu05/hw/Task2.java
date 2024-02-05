package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task2 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean repeate = false;
        do {
            System.out.println("Enter two numbers");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.println("The sum is " + (first + second));
            System.out.println("Would you like to do it agan? (enter yes or not)");
            scanner.nextLine();
            String userAnswer = scanner.nextLine();
            if(userAnswer.equals("yes")) {
                repeate = true;
            } else {
                repeate = false;
            }
        } while (repeate);
    }
}
