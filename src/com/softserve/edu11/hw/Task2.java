package com.softserve.edu11.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with a double space between the words");
        String sentence = scanner.nextLine();

        String modifiedSentence = sentence.replaceAll("\\s", " ");
        System.out.println("Modified sentence with singe space: " + modifiedSentence);
    }
}
