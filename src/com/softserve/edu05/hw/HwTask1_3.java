package com.softserve.edu05.hw;


import java.util.Scanner;

public class HwTask1_3 {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(SCANNER.nextLine());

        }
        System.out.println("Введений масив: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        //check if positive > increment pos > if pos is 2, the index = ix
        int pos = 0;
        int ix = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                pos++;
                if (pos == 2) {
                    ix = i + 1;
                    break;
                }
            }
        }
        if (ix != -1) {
            System.out.println("Позиція другого додатнього числа: " + ix);
        } else {
            System.out.println("Друге додатнє число не знайдено.");
        }
    }
}
