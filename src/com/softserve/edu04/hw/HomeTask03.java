package com.softserve.edu04.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class HomeTask03 {
    public static void main(String[] args) {
        int errorNumber = input("Input error number: ");//Good
        //Add spaces for good readable of code
        HTTPError description = null;

        switch (errorNumber) {
            case 400 -> description = HTTPError.BAD_REQUEST;
            case 401 -> description = HTTPError.UNAUTHORIZED;
            case 402 -> description = HTTPError.PAYMENT_REQUIRED;
            case 403 -> description = HTTPError.FORBIDDEN;
            case 404 -> description = HTTPError.NOT_FOUND;
            case 405 -> description = HTTPError.METHOD_NOT_ALLOWED;
            case 406 -> description = HTTPError.NOT_ACCEPTABLE;
            case 407 -> description = HTTPError.PROXY_AUTHENTICATION_REQUIRED;
            case 408 -> description = HTTPError.REQUEST_TIMEOUT;
            case 409 -> description = HTTPError.CONFLICT;
            case 410 -> description = HTTPError.GONE;
            case 411 -> description = HTTPError.LENGTH_REQUIRED;
            case 412 -> description = HTTPError.PRECONDITION_FAILED;
            case 413 -> description = HTTPError.PAYLOAD_TOO_LARGE;
            case 414 -> description = HTTPError.URI_TOO_LONG;
            case 415 -> description = HTTPError.UNSUPPORTED_MEDIA_TYPE;
            case 416 -> description = HTTPError.RANGE_NOT_SATISFIABLE;
            case 417 -> description = HTTPError.EXPECTATION_FAILED;
            case 418 -> description = HTTPError.IM_A_TEAPOT;
            case 421 -> description = HTTPError.MISDIRECTED_REQUEST;
            case 422 -> description = HTTPError.UNPROCESSABLE_ENTITY;
            case 423 -> description = HTTPError.LOCKED;
            case 424 -> description = HTTPError.FAILED_DEPENDENCY;
            case 425 -> description = HTTPError.TOO_EARLY;
            case 426 -> description = HTTPError.UPGRADE_REQUIRED;
            case 428 -> description = HTTPError.PRECONDITION_REQUIRED;
            case 429 -> description = HTTPError.TOO_MANY_REQUESTS;
            case 431 -> description = HTTPError.REQUEST_HEADER_FIELDS_TOO_LARGE;
            case 451 -> description = HTTPError.UNAVAILABLE_FOR_LEGAL_REASONS;
            default -> {}
        }

        if ((errorNumber >= 400) && (errorNumber < 500) && (description != null)){
            System.out.println("Error description is: " + description);
        } else if ((errorNumber >= 400) && (errorNumber < 500)) {
            System.out.println("Unknown error code.");
        } else {
            System.out.println("Not an error status code.");
        }
    }
    private static int input(String s) {
        System.out.print(s);
        Scanner scan = new Scanner(in);
        return scan.nextInt();
    }

}

