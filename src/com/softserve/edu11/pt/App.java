package com.softserve.edu11.pt;

import java.util.Scanner;
import java.util.regex.*;

import static java.lang.System.in;

public class App {
    public static void main(String[] args) {

        //Task 1
        String fragment = "SoftServe";
        String text = "SoftServe Academy";
        System.out.println(text.contains(fragment));

        // Task2
        Scanner scanner = new Scanner(in);
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.format("%s %c. %c.%n", lastName, firstName.charAt(0), middleName.charAt(0));

        System.out.println(firstName);
        System.out.printf("%s %s %s%n", firstName, middleName, lastName);

        //Task3
        String name1 = "Vitalii";
        String name2 = "Vi";
        String name3 = "11Vitalii";
        String name4 = "Віталій";
        String name5 = "V_i_t_a_l_i_i";
        var regex = "^\\w{3,15}$";
        System.out.println(name1.matches(regex));
        System.out.println(name2.matches(regex));
        System.out.println(name3.matches(regex));
        System.out.println(name4.matches(regex));
        System.out.println(name5.matches(regex));
    }
}
