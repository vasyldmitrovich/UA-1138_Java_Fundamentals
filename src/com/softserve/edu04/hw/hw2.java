package com.softserve.edu04.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Input the second number:");
        int num2 =  scanner.nextInt();

        System.out.println("Input the third number:");
        int num3 =  scanner.nextInt();

        //Move next code to some method and call this method here
        int max = num1;
        int min = num2;
        if (num2 > max) {
            max = num2;
        } else if (num2 < min) {
            min = num2;
        }

        if (num3 > max) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
        }

        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
    }
}
