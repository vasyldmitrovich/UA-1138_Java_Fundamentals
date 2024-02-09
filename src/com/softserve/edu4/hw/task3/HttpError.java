package com.softserve.edu4.hw.task3;

public enum HttpError {
    ERROR_400,
    ERROR_401,
    ERROR_402,
    ERROR_403,
    ERROR_404;

    public void printErrorMessage() {
        switch (this) {
            case ERROR_400 -> System.out.println("Bad Request");
            case ERROR_401 -> System.out.println("Unauthorized");
            case ERROR_402 -> System.out.println("Payment Required");
            case ERROR_403 -> System.out.println("Forbidden");
            case ERROR_404 -> System.out.println("Not Found");
        }
    }
}
