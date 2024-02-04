package com.softserve.edu03.hw.Task2;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        double firstNumber = getValueSide("Input the first number: ");
        double secondNumber = getValueSide("Input the second number: ");
        double thirdNumber = getValueSide("Input the third number: ");
        double minNumber = findMinNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println("Minimal number is " + minNumber);
    }

    private static double getValueSide(String messageToUser) {
        System.out.println(messageToUser);
        Scanner scan = new Scanner(in);
        return Double.parseDouble(scan.nextLine());
    }

    private static double findMinNumber(double firstNumber, double secondNumber, double thirdNumber) {
        double minimalNumber = 0;
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            minimalNumber = firstNumber;
        } else {
            if (secondNumber <= thirdNumber && secondNumber <= firstNumber) {
                minimalNumber = secondNumber;
            } else {
                if (thirdNumber <= secondNumber && thirdNumber <= firstNumber) {
                    minimalNumber = thirdNumber;
                }
            }
        }
        return  minimalNumber;
    }
}
