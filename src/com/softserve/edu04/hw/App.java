package com.softserve.edu04.hw;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Task 1
//        App.task1();

        // Task 2
        App.task2();
    }

    public static void task1() {
        System.out.println("Enter the first number");
        float firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        float secondNumber = scanner.nextInt();
        System.out.println("Enter the third number");
        float thirdNumber = scanner.nextInt();

        if ((firstNumber <= 5 && firstNumber >=-5) &&
            (secondNumber <= 5 && secondNumber >=-5) &&
            (thirdNumber <= 5 && thirdNumber >=-5)
        ) {
            System.out.println("All numbers belongs to range");
        } else {
            System.out.println("One of the number out of range");
        }
    }

    public static void task2() {
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
