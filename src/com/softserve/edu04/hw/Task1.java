package com.softserve.edu04.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        System.out.println("Enter the first number");
        float firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        float secondNumber = scanner.nextInt();
        System.out.println("Enter the third number");
        float thirdNumber = scanner.nextInt();

        if ((firstNumber <= 5 && firstNumber >=-5) &&
                (secondNumber <= 5 && secondNumber >=-5) &&
                (thirdNumber <= 5 && thirdNumber >=-5)
        ) {
            System.out.println("All numbers belongs to range");
        } else {
            System.out.println("One of the number out of range");
        }
    }
}
