package com.softserve.edu10.PT;

import java.util.Scanner;

import static java.lang.System.in;

public class pt02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter Last name: ");
        String lastname = scanner.nextLine();
        System.out.println("Enter First name: ");
        String firstname = scanner.nextLine();
        System.out.println("Enter Middle name: ");
        String middlename = scanner.nextLine();
        System.out.format("%s %c. %C.%n", lastname, firstname.charAt(0), middlename.charAt(0));
        System.out.println(firstname);
        System.out.printf("%s %s %s%n", firstname, middlename, lastname);
    }
}
