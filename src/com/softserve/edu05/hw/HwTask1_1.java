package com.softserve.edu05.hw;

import java.util.Scanner;

public class HwTask1_1 {//Ok
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of a month: ");
        int inputNumber = Integer.parseInt(SCANNER.nextLine());

        int[] dayInMont = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (inputNumber > 12 || inputNumber <= 0) {
            System.out.println("There is no a month with a such number");
        } else {
            int day = dayInMont[inputNumber - 1];
            System.out.println("The number of days in month ( " + inputNumber + " ) is " + day);
        }
    }
}
