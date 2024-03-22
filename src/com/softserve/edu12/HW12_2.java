package com.softserve.edu12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW12_2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        while (end <= 100) {
            readNumber(start, end);
            start = end;
            end += 10;
        }
    }

    public static void readNumber(int start, int end) {
        System.out.print("Please enter the number > " + start + " and <= " + end + ": ");
        int number = scanner.nextInt();
        if (number <= start || number > end) {
            throw new InputMismatchException("Entered number is out of [" + (start + 1) + ", " + end + "]");
        }
    }
}
