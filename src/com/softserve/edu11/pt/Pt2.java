package com.softserve.edu11.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class Pt2 {//Good
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter lastname:");
        String lastname = scanner.nextLine();
        System.out.println("Enter firstname:");
        String firstname = scanner.nextLine();
        System.out.println("Enter middle name:");
        String middleName = scanner.nextLine();

        System.out.format("%s %c. %c.%n",
                lastname,
                firstname.charAt(0),
                middleName.charAt(0));
        System.out.println(firstname);
        System.out.printf("%s %s %s%n", firstname, middleName, lastname );
    }
}
