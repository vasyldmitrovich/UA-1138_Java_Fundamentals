package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class Hw04 {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        checkRandomNum(random(), input());
    }

    public static void checkRandomNum(int random, int input) {
        boolean repeat = true;
        do {
            if (input == random) {
                System.out.println("You guessed it");
                repeat = false;
            }
            if (input < random) {
                System.out.println("To low try again");
                input = input();
            }
            if (input > random) {
                System.out.println("To high try again");
                input = input();
            }
        } while (repeat);
    }

    public static int input() {
        System.out.println("Enter random number: ");
        return scanner.nextInt();
    }

    public static int random() {
        return random.nextInt(0, 1000);
    }

}
