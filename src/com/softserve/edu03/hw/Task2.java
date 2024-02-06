package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Task2.task2();
    }

    public static int task2() {
        System.out.println("Enter the first number");
        int firstNumber = SCANNER.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = SCANNER.nextInt();

        System.out.println("Enter the third number");
        int thirdNumber = SCANNER.nextInt();

        int theSmallestNumber = 0;

        if(firstNumber < secondNumber && firstNumber < thirdNumber) {
            theSmallestNumber = firstNumber;
        } else if(secondNumber < firstNumber && secondNumber < thirdNumber){
            theSmallestNumber = secondNumber;
        } else if(thirdNumber < firstNumber && thirdNumber < secondNumber){
            theSmallestNumber = thirdNumber;
        }

        System.out.println(theSmallestNumber);
        return theSmallestNumber;
    }
}
