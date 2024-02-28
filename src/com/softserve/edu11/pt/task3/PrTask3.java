package com.softserve.edu11.pt.task3;

import java.util.Scanner;

public class PrTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name:");
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
