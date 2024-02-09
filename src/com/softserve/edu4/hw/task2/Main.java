package com.softserve.edu4.hw.task2;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        int firstNumber = getNumber("Input the first number: ");
        int secondNumber = getNumber("Input the second number: ");
        int thirdNumber = getNumber("Input the third number: ");

        System.out.println("Minimal number is " + findMin(firstNumber, secondNumber, thirdNumber));
        System.out.println("Maximal number is " + findMax(firstNumber, secondNumber, thirdNumber));
    }

    private static int getNumber(String messageToUser) {
        System.out.println(messageToUser);
        Scanner scan = new Scanner(in);
        return Integer.parseInt(scan.nextLine());
    }

    private static int findMin(int firstNumber, int secondNumber, int thirdNumber) {

        int minimalNumber = 0;

        if(firstNumber < secondNumber && firstNumber < thirdNumber) {
            minimalNumber = firstNumber;
        } else if(secondNumber < firstNumber && secondNumber < thirdNumber){
            minimalNumber = secondNumber;
        } else if(thirdNumber < firstNumber && thirdNumber < secondNumber){
            minimalNumber = thirdNumber;
        }

        return  minimalNumber;
    }

    private static int findMax(int firstNumber, int secondNumber, int thirdNumber) {

        int maximalNumber = 0;

        if(firstNumber > secondNumber && firstNumber > thirdNumber) {
            maximalNumber = firstNumber;
        } else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            maximalNumber = secondNumber;
        } else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
            maximalNumber = thirdNumber;
        }

        return maximalNumber;
    }
}