package com.softserve.edu13.hw;

public class Task1 {
    public static void main(String[] args) {
        String text = "abc";
        System.out.println(text);
        String encryptedText = encrypt(text, 3);
        System.out.println("Encrypted: " + encryptedText);
        String decryptedText = decrypt(encryptedText, 3);
        System.out.println("Decrypted: " + decryptedText);
    }

    public static String encrypt(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                int newPos = (c - 'a' + n) % 26;
                sb.append((char) (newPos + 'a'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                int newPos = (c - 'a' - n + 26) % 26;
                sb.append((char) (newPos + 'a'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
