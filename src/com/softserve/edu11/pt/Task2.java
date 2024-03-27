package com.softserve.edu11.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.println("Enter lastname: ");
        String lastname = scan.nextLine();

        System.out.println("Enter firstname: ");
        String firstname = scan.nextLine();

        System.out.println("Enter middlename: ");
        String middlename = scan.nextLine();

        System.out.format("%s %c. %c. \n", lastname, firstname.charAt(0), middlename.charAt(0));
        System.out.println(firstname);
        System.out.printf("%s %s %s \n", firstname, middlename, lastname);
    }
}