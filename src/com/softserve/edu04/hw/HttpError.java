package com.softserve.edu04.hw;

import java.util.Scanner;

public class HttpError {
    public static final Scanner SCANNER = new Scanner(System.in);//This field move to file for example App.java
    public static void main(String[] args) {//This method move to file for example App.java
        Error error = Error.getNum(num());
        System.out.println("This error: " + error.getEr());
    }

    public static int num(){
        System.out.println("Please input number of error: ");
        return SCANNER.nextInt();
    }


}
enum Error {//Move to file Error.java
    BAD_REQUEST_400("400 Bad Request"),
    UNAUTHORIZED_401("401 Unauthorized"),
    PAYMENT_REQUIRED_402("402 Payment Required "),
    FORBIDDEN_403("403 Forbidden"),
    NOT_FOUND_404("404 Not Found"),
    METHOD_NOT_ALLOWED_405("405 Method Not Allowed"),
    NOT_ACCEPTABLE_406("406 Not Acceptable"),
    PROXY_AUTHENTICATION_REQUIRED_407("407 Proxy Authentication Required"),
    REQUEST_TIMEOUT_408("408 Request Timeout"),
    CONFLICT_409("409 Conflict"),
    GONE_410("410 Gone"),
    LENGTH_REQUIRED_411("411 Length Required"),
    PRECONDITION_FAIL_412("412 Precondition Failed"),
    PAYLOAD_TOO_LARGE_413("413 Payload Too Large"),
    URI_TOO_LONG_414("414 URI Too Long"),
    UNSUPPORTED_MEDIA_TYPE_415("415 Unsupported Media Type"),
    RANGE_NOT_SATISFIABLE_416("416 Range Not Satisfiable"),
    EXPECTATION_FAILED_417("417 Expectation Failed"),
    I_AM_TEAPOT_418("418 I'm a teapot"),
    MISDIRECTED_REQUEST_421("421 Misdirected Request"),
    UNPROCESSABLE_CONTENT_422("422 Unprocessable Content (WebDAV)"),
    LOCKED_423("423 Locked (WebDAV)"),
    FAILED_DEPENDENCY_424("424 Failed Dependency (WebDAV)"),
    TOO_EARLY_425("425 Too Early "),
    UPGRADE_REQUIRED_426("426 Upgrade Required"),
    PRECONDITION_REQUIRED_428("428 Precondition Required"),
    TOO_MANY_REQUESTS_429("429 Too Many Requests"),
    REQUEST_HEADER_FIELDS_TOO_LARGE_431("431 Request Header Fields Too Large"),
    UNAVAILABLE_FOR_LEGAL_REASONS_451("451 Unavailable For Legal Reasons");


    private final String er;

    Error(String er) {
        this.er = er;
    }

    public String getEr() {
        return er;
    }

    public static Error getNum(int numError) {//This method move to file for example App.java
        return switch (numError) {
            case 400 -> BAD_REQUEST_400;
            case 401 -> UNAUTHORIZED_401;
            case 402 -> PAYMENT_REQUIRED_402;
            case 403 -> FORBIDDEN_403;
            case 404 -> NOT_FOUND_404;
            case 405 -> METHOD_NOT_ALLOWED_405;
            case 406 -> NOT_ACCEPTABLE_406;
            case 407 -> PROXY_AUTHENTICATION_REQUIRED_407;
            case 408 -> REQUEST_TIMEOUT_408;
            case 409 -> CONFLICT_409;
            case 410 -> GONE_410;
            case 411 -> LENGTH_REQUIRED_411;
            case 412 -> PRECONDITION_FAIL_412;
            case 413 -> PAYLOAD_TOO_LARGE_413;
            case 414 -> URI_TOO_LONG_414;
            case 415 -> UNSUPPORTED_MEDIA_TYPE_415;
            case 416 -> RANGE_NOT_SATISFIABLE_416;
            case 417 -> EXPECTATION_FAILED_417;
            case 418 -> I_AM_TEAPOT_418;
            case 421 -> MISDIRECTED_REQUEST_421;
            case 422 -> UNPROCESSABLE_CONTENT_422;
            case 423 -> LOCKED_423;
            case 424 -> FAILED_DEPENDENCY_424;
            case 425 -> TOO_EARLY_425;
            case 426 -> UPGRADE_REQUIRED_426;
            case 428 -> PRECONDITION_REQUIRED_428;
            case 429 -> TOO_MANY_REQUESTS_429;
            case 431 -> REQUEST_HEADER_FIELDS_TOO_LARGE_431;
            case 451 -> UNAVAILABLE_FOR_LEGAL_REASONS_451;
            default -> throw new IllegalArgumentException("Please error from 400 to 451!!!");
        };
    }
}

