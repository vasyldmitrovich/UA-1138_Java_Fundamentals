package com.softserve.edu04.hw;

import java.util.Scanner;


public class HW2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = SCANNER.nextInt();
        int n2 = SCANNER.nextInt();
        int n3 = SCANNER.nextInt();

        int max = n1;

        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        System.out.println("There maximum number is " + max);

        int min = n1;
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        System.out.println  ("There minimum number is " + min);

    }}



