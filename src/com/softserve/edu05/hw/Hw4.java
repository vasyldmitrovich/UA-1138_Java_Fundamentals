package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Hw4 {
    public static void guessNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(0, 3);
        System.out.println(randomNumber);
        Scanner scanner = new Scanner(in);
        boolean keepAsking = true;

        while (keepAsking) {
            System.out.print("Guess a number: ");
            int userNumber = scanner.nextInt();
            if (userNumber > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (userNumber < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Correct.");
                keepAsking = false;
            }
        }
    }
}
