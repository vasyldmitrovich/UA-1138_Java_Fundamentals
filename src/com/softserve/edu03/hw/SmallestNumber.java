package com.softserve.edu03.hw;

public class SmallestNumber {
    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 32;
        int num3 = 54;

        int smallNumber = findSmallNumber(num1, num2, num3);
        System.out.println("The smallest number is: " + smallNumber);
    }

    public static int findSmallNumber(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }
}
