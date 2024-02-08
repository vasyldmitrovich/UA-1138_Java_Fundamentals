package com.softserve.edu05.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class HomeTask01First {
    public static void main(String[] args) {
        Month[] months = {
                new Month(1, 31),
                new Month(2, 28),
                new Month(3, 31),
                new Month(4, 31),
                new Month(5, 31),
                new Month(6, 31),
                new Month(7, 31),
                new Month(8, 31),
                new Month(9, 31),
                new Month(10, 31),
                new Month(11, 31),
                new Month(12, 31)
        };
        int monthNumber = inputMonthNumber("Enter the month number: ");
        if (monthNumber >= 1 && monthNumber <= 12) {
            for (Month month : months) {
                if (monthNumber == month.getNumber()) {
                    System.out.println("Number of days in month " + monthNumber + ": " + month.getDays());
                    break;
                }
            }
        } else {
            System.out.println("Invalid month number.");
        }

    }

    private static int inputMonthNumber(String month) {
        System.out.println(month);
        Scanner scan = new Scanner(in);
        return scan.nextInt();
    }

}

class Month {
    private int number;
    private int days;

    public Month(int number, int days) {
        this.number = number;
        this.days = days;
    }

    public int getNumber() {
        return number;
    }

    public int getDays() {
        return days;
    }
}
