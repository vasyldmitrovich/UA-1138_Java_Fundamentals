package com.softserve.edu04.hw;

import java.util.Scanner;

public class Homework3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int numberOfError;

        HTTPError sc400 = HTTPError.StatusCode400;
        HTTPError sc401 = HTTPError.StatusCode401;
        HTTPError sc402 = HTTPError.StatusCode402;
        HTTPError sc403 = HTTPError.StatusCode403;
        HTTPError sc404 = HTTPError.StatusCode404;

        System.out.println("Enter the number of error: ");
        numberOfError = scanner.nextInt();
        if (numberOfError == 400) {
            System.out.println("Error: " + sc400.getCode());
            System.out.println("Description: " + sc400.getDescription());
        } else if (numberOfError == 401) {
            System.out.println("Error: " + sc401.getCode());
            System.out.println("Description: " + sc401.getDescription());
        } else if (numberOfError == 402) {
            System.out.println("Error: " + sc402.getCode());
            System.out.println("Description: " + sc402.getDescription());
        } else if (numberOfError == 403) {
            System.out.println("Error: " + sc403.getCode());
            System.out.println("Description: " + sc403.getDescription());
        } else {
            System.out.println("Error: " + sc404.getCode());
            System.out.println("Description: " + sc404.getDescription());
        }

    }

    enum HTTPError {//Move to file HTTPError.java not here
        StatusCode400(400, "Bad Request"),
        StatusCode401(401, "Unauthorized"),
        StatusCode402(402, "Payment Required"),
        StatusCode403(403, "Forbidden"),
        StatusCode404(404, "Not Found");

        final int code;
        final String description;

        HTTPError(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public int getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

    }

}
