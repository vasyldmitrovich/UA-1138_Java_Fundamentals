package com.softserve.edu03.hw;

import java.util.Scanner;

public class Homework2 {
    public static Scanner scanner = new Scanner(System.in);
    private static double firstNumber;//Without static
    private static double secondNumber;
    private static double thirdNumber;

    public static void main(String[] args) {
        Homework2 Numbers = new Homework2();
        Numbers.getNumbers();
        Homework2 smallestNumber = new Homework2();
        smallestNumber.getSmallestNumber();
    }

    public void getNumbers() {
        System.out.println("Input the first number: ");
        firstNumber = scanner.nextDouble();
        System.out.println("Input the second number: ");
        secondNumber = scanner.nextDouble();
        System.out.println("Input the third number: ");
        thirdNumber = scanner.nextDouble();
    }

    public void getSmallestNumber() {
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("The smallest number is: " + firstNumber);
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            System.out.println("The smallest number is: " + secondNumber);
        } else {
            System.out.println("The smallest number is: " + thirdNumber);
        }
    }
}
