package com.softserve.edu11.pt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean isSubstring = str2.contains(str1);

        System.out.println("Is \"" + str1 + "\" a substring of \"" + str2 + "\"? " + isSubstring);
    }
}
