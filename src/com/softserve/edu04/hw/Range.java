package com.softserve.edu04.hw;

import java.util.Scanner;

public class Range {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        range(input("Please input first number: "),
                input("Please input second number: "),
                input("Please input third number: "));
    }

    public static float input(String s) {
        System.out.println(s);
        return SCANNER.nextFloat();
    }

    public static void range(float first, float second, float third) {
        if (first <= 5 && second <= 5 && third <= 5 &&
                first >= -5 && second >= -5 && third >= -5) {
            System.out.println("All three numbers fall within " +
                    "the range of -5 and 5 (inclusive) ");
        } else {
            System.out.println("Indicating that not all numbers belong to the range [-5, 5].");
        }
    }
}
