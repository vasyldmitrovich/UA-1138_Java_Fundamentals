package com.softserve.edu11.hw;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String modifiedSentence = sentence.replaceAll("\\s+", " ");

        System.out.println("Modified sentence: " + modifiedSentence);
    }
}
