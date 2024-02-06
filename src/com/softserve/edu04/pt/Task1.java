package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {//Ok
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int oddCount = 0;
        if (num1 % 2 != 0) {
            oddCount++;
        }
        if (num2 % 2 != 0) {
            oddCount++;
        }
        if (num3 % 2 != 0) {
            oddCount++;
        }

        System.out.println("Number of odd numbers: " + oddCount);

    }
}