package com.softserve.edu04.hw;

import java.util.Scanner;

public class Homework1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double number;

        System.out.println("Input number: ");
        number = scanner.nextDouble();
        if (number <= 5 && number >= -5) {
            System.out.println("The number is within range");
        } else {
            System.out.println("The number is out of range");
        }

    }
}
