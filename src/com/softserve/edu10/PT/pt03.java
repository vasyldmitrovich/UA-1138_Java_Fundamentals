package com.softserve.edu10.PT;

import java.util.Scanner;

import static java.lang.System.in;

public class pt03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name ");
            var name = scanner.nextLine();
            var res = validate(name);
            System.out.println("The name is " + (!res ? "in" : "") + "valid");

        }
    }

    public static boolean validate(String name) {
        var regex = "^\\w{3,15}$";
        return name.matches(regex);
    }

}
