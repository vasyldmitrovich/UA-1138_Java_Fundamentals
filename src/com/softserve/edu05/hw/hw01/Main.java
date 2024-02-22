package com.softserve.edu05.hw.hw01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int[] daysMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] numbers = new int[10];
        int[] fiveNum = new int[5];

        Numbers.input(numbers);
        System.out.println(Arrays.toString(numbers));
        Numbers.positiveOrNegative(numbers);

        Numbers.input(fiveNum);
        Numbers.positionNumber(fiveNum);
        Numbers.minimumValue(fiveNum);
        Numbers.calculateProduct(fiveNum);
        getMonth(daysMonth);
    }

    public static void getMonth(int[] month){
        System.out.println("Enter a month number: ");
        int numMonth = SCANNER.nextInt();
        System.out.println("How many days does " + Month.monthOutput(numMonth).getMonth()
                + " have " + month[numMonth -1]);
    }
}
