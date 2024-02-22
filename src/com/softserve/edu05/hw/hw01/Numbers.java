package com.softserve.edu05.hw.hw01;

import static com.softserve.edu05.hw.hw01.Main.SCANNER;

public class Numbers {
    private int number;


    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static void input(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + 1 + " num: ");
            numbers[i] = SCANNER.nextInt();
        }
    }

    public static void positiveOrNegative(int[] numbers) {
        boolean positive = true;
        int sum = 0;
        int product = 1;

        for (int i = 0; i < numbers.length - 5; i++) {
            if (numbers[i] < 0) {
                positive = false;
                break;
            }
            sum += numbers[i];
        }

        if (positive) {
            System.out.println("The sum is: " + sum);
        } else {
            for (int i = 5; i < numbers.length; i++) {
            product *= numbers[i];
            }
            System.out.println("The product is: " + product);
        }
    }

    public static void positionNumber(int[] nubmers){
        int count= 0;
        int position = 0;
        for (int i = 0; i < nubmers.length; i++){
            if(nubmers[i] >= 0 && count < 2){
                count++;
                position = i;
            }
        }
        if(count == 2){
            System.out.println("Position in array: " + position);
        } else {
            System.out.println("The array contains one or no positive numbers");
        }
    }

    public static void minimumValue(int[] numbers){
        int position = 0;
        int minimum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < minimum){
                position = i;
                minimum = numbers[i];
            }
        }
        System.out.println("Minimum value is: " + minimum + " and position in array " + position);
    }

    public static void calculateProduct(int[] numbers){
        int product = 1;
        boolean operationTookPlace = false;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0 && numbers[i] != 0){
                product *= numbers[i];
                operationTookPlace = true;
            }
        }
        if (operationTookPlace) {
            System.out.println("Product is: " + product);
        } else {
            System.out.println("Even numbers not contain in array");
        }
    }
}
