package com.softserve.edu11.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class Pt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name:");
            var name = scanner.nextLine();
            var result = validate(name);
            System.out.println("The name is " +
                    (!result ? "in" : "") + "valid");
        }
    }

    public static boolean validate(String name) {
        var regex = "^\\w{3,15}$";
        return name.matches(regex);
    }
}
