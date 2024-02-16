package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class PrTask01 {//Ok
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Jack"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        double[] numbers = {1, 2, 2.5, 3, 4};
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("The average value is: " + average);

        System.out.println("Enter the name to search: ");
        String nameToSearch = SCANNER.nextLine();
        boolean found = false;
        for (var name : names) {
            if (name.equals(nameToSearch)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The " + nameToSearch + " is in the list.");
        } else {
            System.out.println("The " + nameToSearch + " is not found.");
        }
    }
}
