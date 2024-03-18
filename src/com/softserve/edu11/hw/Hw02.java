package com.softserve.edu11.hw;

import java.util.Scanner;

public class Hw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");

        System.out.println(text);
        System.out.println("Text without extra space");
        System.out.println(deleteSpace(words)); // method

        String withoutWhiteSpace = text.replaceAll("\\s+", " "); // regex
        System.out.println(withoutWhiteSpace);
    }

    private static String deleteSpace(String[] text){
        String newText = "";
        String checkSpace = "";
        for (int i = 0; i < text.length; i++) {
            newText += text[i];
            if(checkSpace != text[i]){
                newText += " ";
            }
        }
        return newText;
    }
}
