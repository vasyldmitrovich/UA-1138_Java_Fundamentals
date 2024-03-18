package com.softserve.edu11.pt;

import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter middle name: ");
        String middleName = scanner.nextLine();

        String initials = (firstName.charAt(0) + "" + middleName.charAt(0)).toUpperCase();
        System.out.println("Last name and initials: " + lastName + ", " + initials);

        System.out.println("First name: " + firstName);
        System.out.println("First name, middle name and last name: " + firstName + " " + middleName + " " + lastName);
    }
}
