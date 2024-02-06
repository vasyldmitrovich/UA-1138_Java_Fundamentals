package com.softserve.edu04.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number");
        int thirdNumber = scanner.nextInt();

        int theSmallestNumber = 0;

        if(firstNumber < secondNumber && firstNumber < thirdNumber) {
            theSmallestNumber = firstNumber;
        } else if(secondNumber < firstNumber && secondNumber < thirdNumber){
            theSmallestNumber = secondNumber;
        } else if(thirdNumber < firstNumber && thirdNumber < secondNumber){
            theSmallestNumber = thirdNumber;
        }

        int theLargestestNumber = 0;

        if(firstNumber > secondNumber && firstNumber > thirdNumber) {
            theLargestestNumber = firstNumber;
        } else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            theLargestestNumber = secondNumber;
        } else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
            theLargestestNumber = thirdNumber;
        }

        System.out.println("The smallest number is " + theSmallestNumber);
        System.out.println("The largest number is " + theLargestestNumber);
    }
}
