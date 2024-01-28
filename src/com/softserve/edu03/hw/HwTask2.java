package com.softserve.edu03.hw;

import java.util.Scanner;

public class HwTask2 {
    public static void main(String[] args) {
        int first = getNumbers("Input the first number: ");
        int second = getNumbers("Input the second number: ");
        int third = getNumbers("Input the third number: ");

        int smallest = getSmallest(first, second, third);
        System.out.println("The smallest number is: " + smallest);
    }

    private static int getNumbers(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private static int getSmallest(int first, int second, int third) {
        return Math.min(Math.min(first, second), third);
    }
}
