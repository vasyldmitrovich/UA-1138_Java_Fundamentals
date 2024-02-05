package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        getNumberOfDaysInMonth();

//        calculateArray();

        task1_3();

    }

    public static void getNumberOfDaysInMonth() {
        int[] numberOfDaysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter the month number");
        int monthNumber = scanner.nextInt();
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.print("Invalid month");
        } else {
            System.out.println("This month has " + numberOfDaysInMonth[monthNumber - 1] + " days.");
        }
    }

    public static void calculateArray() {
        System.out.println("Enter 10 integers numbers: ");
        int[] array = new int[10];

        long result = 0;

        boolean isFirstFivePositive = true;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if(array[i] < 0 && i < 5) {
                isFirstFivePositive = false;
            }
        }

        if(isFirstFivePositive) {
            for (int i = 0; i <5; i++) {
                result += array[i];
            }
        } else {
            result = 1;
            for (int i = 5; i < array.length; i++) {
                result *= array[i];
            }
        }

        System.out.println(result);
    }

    public static void task1_3() {
        System.out.println("Enter 5 integers numbers: ");
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int secondPositiveNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                if (array[i+1] > 0) {
                    secondPositiveNumber = array[i+1];
                    break;
                }
            }
        }
        System.out.println(secondPositiveNumber);

        //min value
        int minValue = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                position = i;
            }
        }
        System.out.println("Minimum value \"" + minValue + "\" found at the position " + (position+1));

        int productOfEvenNumbers = 1;
        for (int el: array) {
            if(el > 0 && el%2 == 0) {
                productOfEvenNumbers *= el;
            }
        }
        System.out.println("The product of all even numbers is " + productOfEvenNumbers);

    }

}
