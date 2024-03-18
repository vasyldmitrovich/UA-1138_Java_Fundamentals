package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        System.out.println("Enter a text with US currency standart:");
        String text = scanner.nextLine();
        Matcher matcher = pattern.matcher(text);

        boolean check = false;
        while (matcher.find()) {
            check = true;
            System.out.println("Found US currency formats:");
            System.out.println(matcher.group());
        }
        if (!check) {
            System.out.println("Not found US currency formats");
        }
    }
}
