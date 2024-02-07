package com.softserve.edu03.hw;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String... args){
        int number1 = getInput("Input number 1: ");
        int number2 = getInput("Input number 2: ");
        int number3 = getInput("Input number 3: ");
        int result = smallestNumber(number1, number2, number3);
        System.out.println("The smallest number is " + result);
    }

    private static int smallestNumber(int number1, int number2, int number3) {//Ok
        if((number1 < number2) && (number1 < number3)){
            return number1;
        }
        else if ((number1 > number2) && (number2 < number3)){
            return number2;
        }
        else {
            return number3;
        }
    }

    private static int getInput(String s) {//Good
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
