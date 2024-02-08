package com.softserve.edu05.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class HomeTask01Second {
    public static void main(String[] args) {
        Number[] numbers = new Number[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("\nEnter number " + (i + 1) + ":");
            numbers[i] = new Number();
            numbers[i].input();
        }


        int sum = 0;
        boolean firstFivePositive = true;

        for (int i = 0; i < 5; i++) {
            if (numbers[i].getNumber() <= 0) {
                firstFivePositive = false;
                break;
            }
            sum += numbers[i].getNumber();
        }

        if (firstFivePositive) {
            System.out.println("The sum is : " + sum);
        } else {
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product *= numbers[i].getNumber();
            }
            System.out.println("The product is : " + product);
        }
    }
}

class Number {
    private int number;

    public Number() {
    }

    public int getNumber() {
        return number;
    }

    public void input() {
        Scanner scan = new Scanner(in);
        this.number = scan.nextInt();
    }
}