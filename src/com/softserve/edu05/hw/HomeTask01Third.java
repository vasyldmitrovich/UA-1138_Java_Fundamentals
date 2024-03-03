package com.softserve.edu05.hw;

public class HomeTask01Third {//Divide some logic to methods and in main method call this methods, do not write all logic in main method
    public static void main(String[] args) {
        Number[] numbers = new Number[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Number();
            System.out.println("Enter the " + (i + 1) + " number: ");
            numbers[i].input();
        }

        System.out.println("Minimal value is " + getMinimalValue(numbers) + " position of the number in array is " + getPositionOfMinimalValue(numbers));

        if (getPositionOfSecondPositiveNumber(numbers) < 1) {
            System.out.println("There are no two positive numbers in the array.");
        } else {
            System.out.println("Position of second positive is " + getPositionOfSecondPositiveNumber(numbers));
        }

        if (productOfEvenNumbersInTheArray(numbers) == 1) {
            System.out.println("There are no even numbers in the array.");
        } else {
            System.out.println("Product of even numbers is " + productOfEvenNumbersInTheArray(numbers));
        }
    }

    public static int getPositionOfSecondPositiveNumber(Number[] numbers) {
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
        return positionOfSecondPositive;
    }

    public static int getMinimalValue(Number[] numbers) {
        int minValue = numbers[0].getNumber();

        for (int i = 0; i < numbers.length; i++) {
            if (minValue > numbers[i].getNumber()) {
                minValue = numbers[i].getNumber();
            }

        }
        return minValue;
    }

    public static int getPositionOfMinimalValue(Number[] numbers) {
        int positionOfMinValue = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[0].getNumber() > numbers[i].getNumber()) {
                positionOfMinValue = i;
            }

        }
        return positionOfMinValue;
    }

    public static int productOfEvenNumbersInTheArray(Number[] numbers) {
        int product = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].getNumber() % 2 == 0 && numbers[i].getNumber() != 0) {
                product *= numbers[i].getNumber();
            }
        }
        return product;
    }
}


