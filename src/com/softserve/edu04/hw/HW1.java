package com.softserve.edu04.hw;

import java.util.Scanner;

public class HW1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input 3 numbers");
        float n1 = SCANNER.nextFloat();
        float n2 = SCANNER.nextFloat();
        float n3 = SCANNER.nextFloat();

        if ((n1 >= -5 && n1 <= 5) &&
                (n2 >= -5 && n2 <= 5) &&
                (n3 >= -5 && n3 <= 5)) {
            System.out.println("All the numbers belong to the range [-5;5]");
        } else {
            System.out.println("Not all the numbers belong to the range ");
        }

    }}


