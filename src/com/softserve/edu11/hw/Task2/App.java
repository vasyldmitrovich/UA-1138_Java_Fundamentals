package com.softserve.edu11.hw.Task2;

import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the sentence:");
        String sentence = scanner.nextLine();

        String removedDoubleSpaceString = sentence.replaceAll("\\s{2,}", " ");
        System.out.println(removedDoubleSpaceString);
    }
}
