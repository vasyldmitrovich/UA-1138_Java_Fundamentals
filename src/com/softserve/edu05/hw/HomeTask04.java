package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class HomeTask04 {
    public static void main(String[] args) {
        int min = -5;
        int max = 5;

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        while (true) {
            int inputNumber = input();
            if (randomNumber == inputNumber) {
                System.out.println("You guess the random number!");
                break;
            } else if (randomNumber < inputNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
        }


    }

    public static int input() {
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(in);
        return scan.nextInt();
    }
}
