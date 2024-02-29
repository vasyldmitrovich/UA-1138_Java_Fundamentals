package com.softserve.edu11.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class PrTask03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name: ");
            var name = scan.nextLine();
            var res = validate(name);
            System.out.println("The name is " + (!res ? "in" : "") + "valid");
        }

    }

    public static boolean validate(String name) {
        var regex = "^\\w{3,15}$";
        return name.matches(regex);
    }
}
