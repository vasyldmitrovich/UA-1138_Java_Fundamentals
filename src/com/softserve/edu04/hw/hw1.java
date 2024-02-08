package com.softserve.edu04.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Add spaces for good readable of code
        System.out.println("Input the first number:");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Input the second number:");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Input the third number:");
        double num3 = Double.parseDouble(scanner.nextLine());

        if ((num1 >= -5 && num1 <= 5) && (num2 >= -5 && num2 <= 5) && (num3 >= -5 && num3 <= 5) ){
            System.out.println("All numbers are in [-5;5]!");
        } else {
            System.out.println("Some of numbers are not in [-5;5]!");
        }
    }
}
