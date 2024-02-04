package com.softserve.edu04.hw;

import java.util.Scanner;

public class HW04_03 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String... args) {
        System.out.println("Enter the number of the HTTP Error: ");
        int code = SCANNER.nextInt();
        HTTPError httpError = HTTPError.getDescriptionByNumber(code);
        System.out.println("This number corresponds to such HTTP Error: " + httpError.description);
    }

    enum HTTPError {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found");

        public final int code;
        public final String description;

        HTTPError(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public static HTTPError getDescriptionByNumber(int code) {
            return switch (code) {
                case 400 -> BAD_REQUEST;
                case 401 -> UNAUTHORIZED;
                case 402 -> PAYMENT_REQUIRED;
                case 403 -> FORBIDDEN;
                case 404 -> NOT_FOUND;
                default -> throw new IllegalArgumentException("There is no such error code: " + code);
            };
        }
    }
}
