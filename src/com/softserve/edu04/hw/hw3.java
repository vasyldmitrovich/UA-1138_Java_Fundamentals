package com.softserve.edu04.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the number of error(400, 401, 402):");
        int num = scanner.nextInt();
        if (num == 400){
            HTTPError httpError1 = HTTPError.ERROR_400;
            System.out.println(httpError1);
        } else if (num == 401){
            HTTPError httpError2 = HTTPError.ERROR_401;
            System.out.println(httpError2);
        } else if (num == 402){
            HTTPError httpError3 = HTTPError.ERROR_402;
            System.out.println(httpError3);
        }
    }
}

enum HTTPError {
    ERROR_400(400, "Bad Request"),
    ERROR_401(401, "Unauthorized"),
    ERROR_402(402, "Payment Required");

    final int error;
    final String description;

    HTTPError(int error, String description) {
        this.error = error;
        this.description = description;
    }

    public int getError() {
        return error;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "HTTPError{" +
                "error=" + error +
                ", description='" + description + '\'' +
                '}';
    }
}
