package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Hw4 {//Ok
    public static void main(String[] args) {
        int randomNumber = generateRandomNumbers();
        System.out.println("Try to guess the number!");
        int count = 0;
        while (true){
            System.out.println("Enter the number:");
            Scanner scanner = new Scanner(in);
            int guessNumber = scanner.nextInt();
            if (randomNumber > guessNumber){
                System.out.println("Too low, try again.");
                count++;
            } else if (randomNumber < guessNumber){
                System.out.println("Too high, try again.");
                count++;
            } else {
                System.out.println("You guessed it!");
                System.out.println("It took you " + (count + 1) +  " tries");
                break;
            }
        }
    }

    static int generateRandomNumbers(){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(0, 100);
        return randomNumber;
    }
}
