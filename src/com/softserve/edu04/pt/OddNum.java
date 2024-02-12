package com.softserve.edu04.pt;

import java.util.Scanner;

public class OddNum {//Ok
    public static void main(String[] args) {
        int first = input("Input first number: ");
        int second = input("Input second number: ");
        int third = input("Input third number: ");

        int count = 0;
        if (first % 2 == 1) {
            count++;
        }
        if (second % 2 == 1) {
            count++;
        }
        if (third % 2 == 1) {
            count++;
        }

        System.out.println("That is how many odd number --> " + count);
    }

    public static int input(String text) {
        System.out.println(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }


}


