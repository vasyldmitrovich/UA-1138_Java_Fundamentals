package com.softserve.edu04.hw;

import java.util.Scanner;

public class RangeNumbers {//Ok
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three float numbers:");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();

        boolean inRange = (num1 >= -5 && num1 <= 5) && (num2 >= -5 && num2 <= 5) && (num3 >= -5 && num3 <= 5);

        if (inRange) {
            System.out.println("Numbers are belong to the range -5. 5");
        } else {
            System.out.println("Not all numbers are belong to the range -5, 5");
        }
    }
}
