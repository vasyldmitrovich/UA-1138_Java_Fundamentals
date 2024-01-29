package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int num1 = getInput("Input number 1: ");
        int num2 = getInput("Input number 2: ");
        int num3 = getInput("Input number 3: ");
        int result = smallestNumber(num1, num2, num3);
        System.out.println("The smallest number is " + result);
    }

    public static int smallestNumber(int num1, int num2, int num3) {
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }

    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }
}