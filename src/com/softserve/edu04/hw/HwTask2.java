package com.softserve.edu04.hw;

import java.util.Scanner;

public class HwTask2 {//Ok
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введіть друге число: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Введіть третє число: ");
        int thirdNumber = scanner.nextInt();

        int maxNumber = firstNumber;
        if (secondNumber > maxNumber) {
            maxNumber = secondNumber;
        }
        if (thirdNumber > maxNumber) {
            maxNumber = thirdNumber;
        }
        System.out.println("Maximum value: " + maxNumber);

        int minNumber = firstNumber;
        if (secondNumber < minNumber) {
            minNumber = secondNumber;
        }
        if (thirdNumber < minNumber) {
            minNumber = thirdNumber;
        }
        System.out.println("Minimum value: " + minNumber);
    }
}
