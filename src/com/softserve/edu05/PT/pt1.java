package com.softserve.edu05.PT;

import java.util.Arrays;
import java.util.Scanner;

public class pt1 {//Rename to Pt1
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String... args) {
        String[] names = {"John", "Bob"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] numbers = {1, 2, 3, 4};
        double sum = 0.0;

        for (double number : numbers) {
            sum += number;
        }

        double avarage = sum / numbers.length;
        System.out.println(Arrays.toString(numbers));
        System.out.println(avarage);

        System.out.println("Enter the name ");
        String value = SCANNER.nextLine();
        boolean found = false;
        for (var name : names) {
            if (name.equals(value)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The name " + value + " is present");
        } else {
            System.out.println("The name " + value + " is not present");
        }

    }
}
