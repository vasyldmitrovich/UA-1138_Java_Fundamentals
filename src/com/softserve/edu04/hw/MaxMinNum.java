package com.softserve.edu04.hw;

import java.util.Scanner;

public class MaxMinNum {//Ok
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
    determinant(input("Please input first num: "), input("Please input second num: "),
            input("Please input third num: "));
    }

    public static int input(String s){
        System.out.println(s);
        return SCANNER.nextInt();
    }

    public static void determinant(int first, int second, int third){
        System.out.println("Max number: " + Math.max(Math.max(first, second), third));
        System.out.println("Min number: " + Math.min(Math.min(first, second), third));
    }

}
