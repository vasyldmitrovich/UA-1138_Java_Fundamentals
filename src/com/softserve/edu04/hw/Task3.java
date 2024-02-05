package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task3 {
    enum HTTPError {
        ERROR_400("Bad Request"),
        ERROR_401("Unauthorized"),
        ERROR_402("Payment Required"),
        ERROR_403("Forbidden"),
        ERROR_404("Not Found"),
        ERROR_405("Method Not Allowed"),
        ERROR_406("Not Acceptable"),
        ERROR_407("Proxy Authentication Required"),
        ERROR_408("Request Timeout"),
        ERROR_409("Conflict"),
        ERROR_410("Gone"),
        ERROR_411("Length Required"),
        ERROR_412("Precondition Failed"),
        ERROR_413("Payload Too Large"),
        ERROR_414("URI Too Long"),
        ERROR_415("Unsupported Media Type"),
        ERROR_416("Range Not Satisfiable"),
        ERROR_417("Expectation Failed"),
        ERROR_418("I'm a teapot");

        private final String name;

        HTTPError(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

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