package com.softserve.edu04.hw;

import java.util.Scanner;

public class HomeTask02 {
    public static void main(String[] args) {
        int first = input("Input first number: ");
        int second = input("Input second number: ");
        int third = input("Input third number: ");
        System.out.println("The smallest number is: " + smallestNumber(first,second,third));
        System.out.println("The biggest number is: " + biggestNumber(first,second,third));


    }
    private static int input(String s) {
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int smallestNumber(int first, int second, int third) {//Good
        if((first < second) && (first < third)){
            return first;
        }
        else if ((first > second) && (second < third)){
            return second;
        }
        else {
            return third;
        }
    }

    private static int biggestNumber(int first, int second, int third) {//Ok
        if((first > second) && (first > third)){
            return first;
        }
        else if ((first < second) && (second > third)){
            return second;
        }
        else {
            return third;
        }
    }

}
