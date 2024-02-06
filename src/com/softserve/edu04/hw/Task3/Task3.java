package com.softserve.edu04.hw.Task3;

import java.util.Scanner;

import static java.lang.System.in;

public class Task3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(in);
            System.out.println("Enter the error code: ");
            int errorCode = scanner.nextInt();
            switch (errorCode) {
                case 404 -> HTTPError.ERROR_404.printErrorName();
                case 500 -> HTTPError.ERROR_500.printErrorName();
                case 502 -> HTTPError.ERROR_502.printErrorName();
            }
    }
}
