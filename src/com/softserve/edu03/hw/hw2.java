package com.softserve.edu03.hw;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {//All good
        int first = getNumber("Input the first number:");
        int second = getNumber("Input the second number:");
        int third = getNumber("Input the third number:");

        System.out.println("The smallest number is: " + findTheSmallestNumber(first,second,third));
    }

    public static int findTheSmallestNumber(int a, int b, int c){
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }

    public static int getNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int num = scanner.nextInt();
        return num;
    }
}

