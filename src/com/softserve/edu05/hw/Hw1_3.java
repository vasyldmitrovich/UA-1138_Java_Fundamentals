package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The position of second positive number is "
                + positionOfSecondPositiveNumber(numbers));
        System.out.println("The minimum value and its position in the array: "
                + Arrays.toString(findMinimumValue(numbers)));
        System.out.println("The product of all entered even numbers is "
                + calculateTheProduct(numbers));
    }

    public static int positionOfSecondPositiveNumber(int[] arr){
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                count++;
                count1 = i;
            }
            if (count == 2){
                break;
            }
        }
        return count1;
    }

    public static int[] findMinimumValue(int[] numbers) {
        int min = numbers[0];
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }

        int[] result = {min, minIndex};
        return result;
    }

    public static int calculateTheProduct(int[] arr){
        int product = 1;
        for (int i: arr){
            if (i == 0){
                continue;
            }
            product *= i;
        }
        return product;
    }
}
