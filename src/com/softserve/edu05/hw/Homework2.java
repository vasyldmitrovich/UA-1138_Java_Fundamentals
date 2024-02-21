package com.softserve.edu05.hw;

import java.util.Scanner;

public class Homework2 {
    private static int num1;
    private static int num2;
    private static int sum;

    public static void main(String[] args) {

        Homework2 sum = new Homework2();
        Homework2.getSum(num1, num2);
    }

    static int getSum(int num1, int num2) {
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        do {
            System.out.println("Enter the first number: ");
            num1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            num2 = scanner.nextInt();
            sum = num1 + num2;
            System.out.println("Sum = " + sum);
            System.out.println("Do you want to perform the operation again?");
            a = scanner.nextBoolean();
        } while (a == true);
        return sum;
    }

}
