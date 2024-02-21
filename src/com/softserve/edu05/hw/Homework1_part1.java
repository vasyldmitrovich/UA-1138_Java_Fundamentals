package com.softserve.edu05.hw;

import java.util.Scanner;

public class Homework1_part1 {
    Scanner scanner = new Scanner(System.in);
    private int[] month = {29, 30, 31};
    private int monthNumber;

    public static void main(String[] args) {
        System.out.println("Enter month number ");
        Homework1_part1 part1 = new Homework1_part1();
        part1.month();
    }

    void month() {
        monthNumber = scanner.nextInt();
        if (monthNumber == 1 ||
                monthNumber == 3 ||
                monthNumber == 5 ||
                monthNumber == 7 ||
                monthNumber == 8 ||
                monthNumber == 10 ||
                monthNumber == 12) {
            System.out.println("Quantity of days in month " + month[2]);
        } else if (monthNumber == 4 ||
                monthNumber == 6 ||
                monthNumber == 9 ||
                monthNumber == 11) {
            System.out.println("Quantity of days in month " + month[1]);
        } else System.out.println("Quantity of days in month " + month[0]);
    }
}