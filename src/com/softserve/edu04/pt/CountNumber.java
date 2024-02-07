package com.softserve.edu04.pt;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int oddCount = countOddNumbers(num1, num2, num3);

        System.out.println("Number of odd numbers " + oddCount);

        scanner.close();
    }

    public static int countOddNumbers(int num1, int num2, int num3) {
        int count = 0;
        if (num1 % 2 != 0) {
            count++;
        }
        if (num2 % 2 != 0) {
            count++;
        }
        if (num3 % 2 != 0) {
            count++;
        }
        return count;
    }
}
