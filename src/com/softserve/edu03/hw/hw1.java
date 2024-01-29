package com.softserve.edu03.hw;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        int first = getNumber("Enter the first side:");
        int second = getNumber("Enter the second side:");
        int third = getNumber("Enter the third side:");
        System.out.println("The area of triangle: %.2f".formatted(getAreaOfTriangle(first,second, third)));
    }

    public static double getAreaOfTriangle(int a, int b, int c){
        double p = (a+b+c)/2.0;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    public static int getNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int num = scanner.nextInt();
        return num;
    }
}
