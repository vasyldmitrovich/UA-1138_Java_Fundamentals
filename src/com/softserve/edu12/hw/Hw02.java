package com.softserve.edu12.hw;

import java.util.Scanner;

public class Hw02 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int oldNum = 1;
        for (int i = 0; i < 10; i++) {
            numbers[i] = readNumber(oldNum, 100);
            oldNum = numbers[i];
        }

        for (var number:
             numbers) {
            System.out.println(number);
        }
    }

    private static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num between " + start + " and " + end + " ");
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if(start <= number && number <= end){
                    return number;
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (NumberFormatException e) {
                System.out.println("This is not a number");
            } catch (IllegalArgumentException e){
                System.out.println("Number must be between " + start + " and " + end);
            }
        }
    }
}
