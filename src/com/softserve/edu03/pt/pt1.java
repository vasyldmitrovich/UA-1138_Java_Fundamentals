package com.softserve.edu03.pt;
import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {//Good
        int first = getNumber("Enter the first number:");
        int second = getNumber("Enter the second number:");

        int sum = getTotal(first,second);
        System.out.println("The sum of " + first + " and " + second + " is " + sum);

        double avg = getAverage(first,second);
        System.out.println("The average of " + first + " and " + second + " is " + avg);
    }
    public static int getTotal(int a, int b) {
        return a+b;
    }

    public static double getAverage(int a, int b){
        return getTotal(a,b) / 2.0;
    }

    public static int getNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int num = scanner.nextInt();
        return num;
    }
}
