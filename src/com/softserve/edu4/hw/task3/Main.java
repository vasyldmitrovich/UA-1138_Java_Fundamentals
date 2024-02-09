package com.softserve.edu4.hw.task3;

import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the error code: ");
        int errorCode = scanner.nextInt();

        switch (errorCode) {
            case 400 -> HttpError.ERROR_400.printErrorMessage();
            case 401 -> HttpError.ERROR_401.printErrorMessage();
            case 402 -> HttpError.ERROR_402.printErrorMessage();
            case 403 -> HttpError.ERROR_403.printErrorMessage();
            case 404 -> HttpError.ERROR_404.printErrorMessage();
        }
    }
}
