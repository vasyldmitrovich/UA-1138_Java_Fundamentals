package com.softserve.edu05.pt;

public class PracticalTask3 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 200 - 100);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println();
        System.out.println("Max = " + max);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];
            }
        }

        int countNegative = 0;
        int countPositive = 0;
        System.out.println("Sum = " + sum);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                countNegative++;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                countPositive++;
            }
        }
        System.out.println("Quantity of negative numbers is " + countNegative);
        if (countNegative > countPositive) {
            System.out.println("There are more negative values in the array");
        } else if (countNegative < countPositive) {
            System.out.println("There are more positive values in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }
}
