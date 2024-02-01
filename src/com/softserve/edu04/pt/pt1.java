package com.softserve.edu04.pt;

import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Input the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Input the third number:");
        int num3 = scanner.nextInt();

        int count = 0;
        if (num1 % 2 != 0){
            count++;
        }
        if (num2 % 2 != 0){
            count++;
        }
        if (num3 % 2 != 0){
            count++;
        }
        System.out.println("You entered " + count + " odd numbers");
    }
}
