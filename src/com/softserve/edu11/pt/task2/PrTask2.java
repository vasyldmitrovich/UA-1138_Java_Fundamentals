package com.softserve.edu11.pt.task2;

import java.util.Scanner;

public class PrTask2 {//Nice all good
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lastname:");
        String lastName = scanner.nextLine();
        System.out.println("Enter firstname:");
        String firstName = scanner.nextLine();
        System.out.println("Enter middle name:");
        String middleName = scanner.nextLine();
        System.out.format("%s %c. %c.%n",
                lastName, firstName.charAt(0), middleName.charAt(0));
        System.out.println(firstName);
        System.out.printf("%s %s %s%n",
                firstName, middleName, lastName);

    }
}
