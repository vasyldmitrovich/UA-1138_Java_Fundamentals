package com.softserve.edu4.hw.task1;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        double firstNumber = getNumber("Input the first number: ");
        double secondNumber = getNumber("Input the second number: ");
        double thirdNumber = getNumber("Input the third number: ");

        if ((firstNumber <= 5 && firstNumber >=-5) &&
                (secondNumber <= 5 && secondNumber >=-5) &&
                (thirdNumber <= 5 && thirdNumber >=-5)) {
            System.out.println("All three numbers belongs to range");
        }
        else {
            System.out.println("Not all numbers belong to the range");
        }
    }

    private static double getNumber(String messageToUser) {
        System.out.println(messageToUser);
        Scanner scan = new Scanner(in);
        return Double.parseDouble(scan.nextLine());
    }
}
