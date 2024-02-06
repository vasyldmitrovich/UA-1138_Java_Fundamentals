package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class HwTask4 {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        var generated = new Random().nextInt(-3, 3);
        int s;
        do {
            System.out.println("Enter  number: ");
            s = Integer.parseInt(SCANNER.nextLine());
            if (s == generated) {
                System.out.println("True");
            }
            if (s < generated) {
                System.out.println("Too low, try again");
            }
            if (s > generated) {
                System.out.println("Too high, try again.");
            }

        } while (s != generated);
    }
}
