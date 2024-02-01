package com.softserve.edu04.hw;

import java.util.Scanner;

public class HomeTask01 {
    public static void main(String[] args) {
        float first = input("Input first number: ");
        float second = input("Input second number: ");
        float third = input("Input third number: ");
        if (((-5.0 <= first) && (first <= 5.0)) && ((-5.0 <= second) && (second <= 5.0)) && ((-5.0 <= third) && (third <= 5.0))) {
            System.out.println("All numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }


    }
    private static float input(String s) {
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

}
