package com.softserve.edu13;

public class HW13_01 {

    public static void main(String[] args) {
        String str = "abc";
        String encrypted = encrypt(str);
        System.out.println(encrypted);
        String decrypted = decrypt(encrypted);
        System.out.println(decrypted);
    }

    public static String encrypt(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            int c = string.charAt(i) + 3;
            sb.append((char) c);
        }

        return sb.toString();
    }

    public static String decrypt(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            int c = string.charAt(i) - 3;
            sb.append((char) c);
        }

        return sb.toString();
    }
}
