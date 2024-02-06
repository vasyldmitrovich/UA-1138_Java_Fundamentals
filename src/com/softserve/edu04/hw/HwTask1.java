package com.softserve.edu04.hw;

import java.util.Scanner;

public class HwTask1 {
    public static void main(String[] args) {//Ok
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число (через кому): ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Введіть друге число (через кому): ");
        float secondNumber = scanner.nextFloat();
        System.out.println("Введіть третє число (через кому): ");
        float thirdNumber = scanner.nextFloat();
        
        if ((firstNumber >= -5 & firstNumber <= 5) &&
                (secondNumber >= -5 & secondNumber <= 5) &&
                (thirdNumber >= -5 & thirdNumber <= 5)) {
            System.out.println("All the numbers belong to the range [-5;5]");
        } else {
            System.out.println("Not all the numbers belong to the range ");
        }

    }
}
