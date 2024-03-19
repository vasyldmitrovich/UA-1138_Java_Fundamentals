package com.softserve.edu13.hw;

import java.util.Scanner;

public class Hw03 {
    public static void main(String[] args) {
        boolean isValid = validateDate(input());
        if (isValid) {
            System.out.println("The year leap is valid");
        } else {
            System.out.println("The year leap is invalid");
        }
    }

    private static boolean validateDate(int dateInput) {
        return dateInput % 4 == 0;
    }

    private static int input(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter year for check, this year leap or not: ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("The number should look like this \'2024\'");
            }
        }
    }
}
