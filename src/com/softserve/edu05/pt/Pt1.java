package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Pt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String[] names = {"Bob", "Tom", "Alice", "John", "Jack"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // ------------------------------------------------------------------ //

        double[] numbers = {12.7, 15, 4.3, 45.1, 3, 43.8, 13, 19, 27.9};
        double sum = 0.0;
        for (double i: numbers){
            sum += i;
        }
        double average = sum / numbers.length;
        System.out.println("The average value is: %.2f".formatted(average));

        // -------------------------------------------------------------------- //

        System.out.println("Enter the name to search:");
        String nameToSearch = scanner.nextLine();
        boolean found = false;
        for (var name: names){
            if(nameToSearch.equals(name)){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("The name '" + nameToSearch + "' is on the list");
        } else {
            System.out.println("The name '" + nameToSearch + "' is not found");
        }

        System.out.println("Enter the name to search:");
        nameToSearch = scanner.nextLine();

        int ix = Arrays.binarySearch(names, nameToSearch);

        if (ix >= 0){
            System.out.println("The name '" + nameToSearch + "' is on the list");
        } else {
            System.out.println("The name '" + nameToSearch + "' is not found");
        }
    }
}
