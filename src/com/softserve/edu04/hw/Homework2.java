package com.softserve.edu04.hw;

import java.util.Scanner;

public class Homework2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;

        //Move next logic to some method and call this method here
        System.out.println("Input first number: ");
        number1 = scanner.nextInt();
        System.out.println("Input second number: ");
        number2 = scanner.nextInt();
        System.out.println("Input third number: ");
        number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("max number: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("max number: " + number2);
        } else {
            System.out.println("max number: " + number3);
        }

        if (number1 < number2 && number1 < number3) {
            System.out.println("min number: " + number1);
        } else if (number2 < number1 && number2 < number3) {
            System.out.println("min number: " + number2);
        } else {
            System.out.println("min number: " + number3);
        }

    }
}