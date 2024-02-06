package com.softserve.edu04.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class PrTask01 {//Ok
    public static void main(String[] args) {
        int number1 = input("Input number 1: ");
        int number2 = input("Input number 2: ");
        int number3 = input("Input number 3: ");

        int count = 0;
        if (number1 % 2 == 1) count++;
        if (number2 % 2 == 1) count++;
        if (number3 % 2 == 1) count++;

        System.out.println("There are " + count + " odd numbers");
    }

    private static int input(String s) {
        System.out.println(s);
        Scanner scan = new Scanner(in);
        return scan.nextInt();
    }
}
