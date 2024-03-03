package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an HTTP error code:");
        int errorCode = scanner.nextInt();
        String errorName = getErrorName(errorCode);
        System.out.println("HTTP Error Name: " + errorName);
    }

    public static String getErrorName(int errorCode) {
        HTTPError[] errors = HTTPError.values();
        int index = errorCode - 400;
        if (index >= 0 && index < errors.length) {
            return errors[index].getName();
        } else {
            return "Unknown Error";
        }
    }
}