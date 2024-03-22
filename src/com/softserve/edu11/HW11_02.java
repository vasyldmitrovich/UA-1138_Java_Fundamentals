package com.softserve.edu11;

import java.util.Scanner;

public class HW11_02 {

    //I  am     learning    Java         Fundamentals

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the sentence of five words: ");
        String sentence = scanner.nextLine();

        System.out.println(sentence.replaceAll("\s+", " "));
    }
}
