package com.softserve.edu04.hw;

import java.util.Scanner;

public class HW04_01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String... args) {
        System.out.println("Enter the first float number: ");
        float num1 = SCANNER.nextFloat();
        System.out.println("Enter the second float number: ");
        float num2 = SCANNER.nextFloat();
        System.out.println("Enter the third float number: ");
        float num3 = SCANNER.nextFloat();

        if ((num1 >= -5 && num1 <= 5)
                && (num2 >= -5 && num2 <= 5)
                && (num3 >= -5 && num3 <= 5)) {
            System.out.println("These numbers are belong to the range [-5, 5] ");
        } else {
            System.out.println("These numbers are not belong to the range [-5, 5] ");
        }
    }
}
