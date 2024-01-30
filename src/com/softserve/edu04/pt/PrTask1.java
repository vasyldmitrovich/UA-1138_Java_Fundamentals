package com.softserve.edu04.pt;

import java.util.Scanner;

public class PrTask1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        if (first % 2 != 0) count++;
        if (second % 2 != 0) count++;
        if (third % 2 != 0) count++;
        System.out.println("There are " + count + " odd numbers");
    }
}
