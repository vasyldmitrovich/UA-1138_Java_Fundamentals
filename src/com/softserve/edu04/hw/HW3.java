package com.softserve.edu04.hw;

import java.util.Scanner;

public class HW3 {
        public static void main(String[] args) {
            final Scanner SCANNER = new Scanner(System.in);
            System.out.println("Enter error number ");
            int inputnumber = SCANNER.nextInt();

            ErrorNumber error = ErrorNumber.getNumber(inputnumber);
            System.out.println("The error message is  " + error.getDescription() );
        }
    enum ErrorNumber {
        BADREQUEST (400, "BadRequest"), NOTFOUND(404, "Not Found"), BADGATEAWAY(502, "Bad Gateaway");

final int number;
final String description;

        ErrorNumber(int number, String description) {
            this.number = number;
            this.description = description;
        }
        public static ErrorNumber getNumber(int inputnumber){
            return switch (inputnumber){
                case 400 -> BADREQUEST;
                case 404 -> NOTFOUND;
                case 502 -> BADGATEAWAY;
                default -> null;

            };

        }

        public String getDescription() {
            return description;
        }

    }
}


