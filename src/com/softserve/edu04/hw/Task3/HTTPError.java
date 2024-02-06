package com.softserve.edu04.hw.Task3;

public enum HTTPError {
    ERROR_404, ERROR_502, ERROR_500;

    public void printErrorName() {
        switch (this) {
            case ERROR_404 -> System.out.println("Not Found");
            case ERROR_500 -> System.out.println("Internal Server Error");
            case ERROR_502 -> System.out.println("Bad Gateway");
        }
    }
}
