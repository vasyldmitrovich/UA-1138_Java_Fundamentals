package com.softserve.edu04.hw;

import java.util.Scanner;

public class ErrorsMapping {
    public enum HTTPErrors {//Move to file HTTPErrors.java
        Error_400("Bad Request"),
        Error_401("Unauthorized"),
        Error_404("Not Found"),
        ;
        private final String description;

        HTTPErrors(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the HTPP error number: ");
        int errorCode = scanner.nextInt();

        HTTPErrors errors = mapErrorCodeToHTTPErrors(errorCode);

        if (errors != null) {
            System.out.println("HTTP Error " + errorCode + ": " + errors.getDescription());
        } else {
            System.out.println("Invalid HTTP error number");
        }
        scanner.close();
    }

    public static HTTPErrors mapErrorCodeToHTTPErrors(int errorCode) {
        for (HTTPErrors errors : HTTPErrors.values()) {
            if (errors.ordinal() == errorCode - 400) {
                return errors;
            }
        }
        return null;
    }
}
