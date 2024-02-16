package com.softserve.edu05.hw;

public class HomeTask01Third {//Divide some logic to methods and in main method call this methods, do not write all logic in main method
    public static void main(String[] args) {
        Number[] numbers = new Number[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Number();
            System.out.println("Enter the " + (i + 1) + " number: ");
            numbers[i].input();
        }

        int j = 0;
        int positionOfSecondPositive = -1;
        int countOfPositiveNumbers = 0;
        while (j < numbers.length && countOfPositiveNumbers < 2) {
            if (numbers[j].getNumber() > 0) {
                countOfPositiveNumbers++;
                if (countOfPositiveNumbers == 2) {
                    positionOfSecondPositive = j;
                }
            }
            j++;
        }


        int minValue = numbers[0].getNumber();
        int positionOfMinValue = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (minValue > numbers[i].getNumber()) {
                minValue = numbers[i].getNumber();
                positionOfMinValue = i;
            }

        }

        int product = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].getNumber() % 2 == 0 && numbers[i].getNumber() != 0) {
                product *= numbers[i].getNumber();
            }
        }


        System.out.println("Minimal value is " + minValue + " position of the number in array is " + positionOfMinValue);

        if (positionOfSecondPositive < 1) {
            System.out.println("There are no two positive numbers in the array.");
        } else {
            System.out.println("Position of second positive is " + positionOfSecondPositive);
        }

        if (product == 1) {
            System.out.println("There are no even numbers in the array.");
        } else {
            System.out.println("Product of even numbers is " + product);
        }
    }
}


