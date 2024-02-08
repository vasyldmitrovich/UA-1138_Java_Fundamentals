package com.softserve.edu05.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String answer = "yes";
        do {
            System.out.println("Enter two numbers:");

            System.out.println("First number:");
            int number1 = scanner.nextInt();

            System.out.println("Second number:");
            int number2 = scanner.nextInt();

            int sum = number1 + number2;
            System.out.println("The sum of numbers is " + sum);

            System.out.println("Do you want to repeat the operation (yes/no) ?");
            scanner.nextLine();
            answer = scanner.nextLine();
        } while (answer.equals("yes"));
    }
}
