package com.softserve.edu05.hw;

import java.util.Scanner;

public class Homework4 {
    Scanner scanner = new Scanner(System.in);
    int num;

    public static void main(String[] args) {
        Homework4 randNumber = new Homework4();
        System.out.println("Try to guess a number from 0 to 100");
        int rand = randNumber.getRandom();
        randNumber.guessNumber(rand);

    }

    void guessNumber(int rand) {
        do {
            num = scanner.nextInt();
            if (rand > num) {
                System.out.println("Too low, try again.");
            } else if (rand < num) {
                System.out.println("Too high, try again");
            } else System.out.println("Congratulation!");
        } while (num != rand);
    }

    int getRandom() {
        return (int) (Math.random() * 100);
    }
}
