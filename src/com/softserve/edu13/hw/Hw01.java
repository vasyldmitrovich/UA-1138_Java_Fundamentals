package com.softserve.edu13.hw;

public class Hw01 {
    public static void main(String[] args) {
        String text = "abc";
        System.out.println(encrypt(text, 3));
        System.out.println(decrypt(text, 3));
    }

    private static String encrypt(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (Character.isUpperCase(character)) {
                char encryptedChar = (char) ((character + n - 'A') % 26 + 'A');
                stringBuilder.append(encryptedChar);
            } else if (Character.isLowerCase(character)) {
                    char encryptedChar = (char) ((character + n - 'a') % 26 + 'a');
                    stringBuilder.append(encryptedChar);
            } else {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }

    private static String decrypt(String s, int n) {
        return encrypt(s, 29 - n);
    }
}
