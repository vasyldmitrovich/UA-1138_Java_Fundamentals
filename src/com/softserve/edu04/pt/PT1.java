package com.softserve.edu04.pt;
import java.util.Scanner;
public class PT1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = SCANNER.nextInt();
        int n2 = SCANNER.nextInt();
        int n3 = SCANNER.nextInt();

        int count = 0;
        if (n1 % 2 != 0) {
            count++;
        }
        if (n2 % 2 != 0) {
            count++;
        }
        if (n3 % 2 != 0) {
                count++;
        }
        System.out.println("There are " + count + " odd numbers.");
    }
}
